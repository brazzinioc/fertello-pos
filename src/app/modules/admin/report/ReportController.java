package app.modules.admin.report;

import java.util.ArrayList;
import java.util.List;

import app.interfaces.Module;
import app.modules.admin.product.ProductModel;
import app.modules.admin.users.UserModel;
import app.modules.sales.SalesModel;
import app.router.RouterView;
import app.utils.Constants;

public class ReportController implements Module {
    private RouterView view;
    private ReportView reportView;
    private ReportModel reportModel;
    private SalesModel salesModel;

    public ReportController(RouterView view, ReportView reportView, ReportModel reportModel, SalesModel salesModel) {
        this.view = view;
        this.reportView = reportView;
        this.reportModel = reportModel;
        this.salesModel = salesModel;
    }

    private String navigationRouteName() {
        return Constants.ADMIN_REPORT_SALE;
    }

    private void handleOption(int option) {
        switch (option) {
            case 1:
                List<SalesModel> sales = salesModel.getSales();
                reportView.showSalesReport(navigationRouteName());
                getTotalAmountSold(sales);
                getTotalProductsSold(sales);

                List<UserModel> sellers = getSellerWithSales(sales);
                getSellerWithMostSales(sellers, sales);

                List<ProductModel> productsSold = getProductsSold(sales);
                getMostSoldProduct(productsSold, sales);

                showSummaryBySeller(sellers, sales);
                break;
        }
    }

    private void getTotalAmountSold(List<SalesModel> sales) {
        double total = 0;
        for (SalesModel sale : sales) {
            total += sale.getTotal();
        }
        reportView.showTotalAmountSold(total);
    }

    private void getTotalProductsSold(List<SalesModel> sales) {
        int quantity = 0;
        for (SalesModel sale : sales) {
            quantity += sale.getProductsQuantity();
        }
        reportView.showTotalProductsSold(quantity);
    }

    private List<UserModel> getSellerWithSales(List<SalesModel> sales) {
        List<UserModel> sellers = new ArrayList<>();

        for (SalesModel sale : sales) {
            UserModel currentSale = sale.getSeller();
            boolean exists = false;
            for (UserModel seller : sellers) {
                if (seller.getDocumentNumber() == currentSale.getDocumentNumber()) {
                    exists = true;
                }
            }
            if (!exists) {
                sellers.add(currentSale);
            }
        }
        return sellers;
    }

    private void getSellerWithMostSales(List<UserModel> sellers, List<SalesModel> sales) {
        UserModel sellerWithMostSales = null;
        int maxSales = 0;
        for (UserModel seller : sellers) {
            int salesQuantity = 0;
            for (SalesModel sale : sales) {
                if (sale.getSeller().getDocumentNumber() == seller.getDocumentNumber()) {
                    salesQuantity += 1;
                }
            }
            if (salesQuantity > maxSales) {
                maxSales = salesQuantity;
                sellerWithMostSales = seller;
            }
        }
        if (sellerWithMostSales != null) {
            reportView.showSellerWithMostSales(sellerWithMostSales.getName(), sellerWithMostSales.getLastName(),
                    maxSales);
        } else {
            reportView.showSellerWithMostSales(null, null, maxSales);
        }
    }

    private List<ProductModel> getProductsSold(List<SalesModel> sales) {
        List<ProductModel> products = new ArrayList<>();

        for (SalesModel sale : sales) {
            ProductModel currentProduct = sale.getProduct();
            boolean exists = false;
            for (ProductModel product : products) {
                if (currentProduct.getSku() == product.getSku()) {
                    exists = true;
                }
            }
            if (!exists) {
                products.add(currentProduct);
            }
        }
        return products;
    }

    private void getMostSoldProduct(List<ProductModel> productsSold, List<SalesModel> sales) {
        ProductModel mostSoldProduct = null;
        int maxQuantity = 0;

        for (ProductModel product : productsSold) {
            int quantity = 0;

            for (SalesModel sale : sales) {
                if (sale.getProduct().getSku() == product.getSku()) {
                    quantity += sale.getProductsQuantity();
                }
            }
            if (quantity > maxQuantity) {
                maxQuantity = quantity;
                mostSoldProduct = product;
            }
        }
        if (mostSoldProduct != null) {
            reportView.showMostSoldProduct(mostSoldProduct.productDetail(), maxQuantity);
        } else {
            reportView.showMostSoldProduct(null, maxQuantity);
        }
    }

    private void showSummaryBySeller(List<UserModel> sellers, List<SalesModel> sales) {
        reportView.showSellerSummaryTitle();
        if (sellers.isEmpty()) {
            reportView.showErrorMessage();
        } else {
            for (UserModel seller : sellers) {
                double total = 0;
                double commission = 0;
                for (SalesModel sale : sales) {
                    if (sale.getSeller().getDocumentNumber() == seller.getDocumentNumber()) {
                        total += sale.getTotal();
                    }
                }
                if (total > 2000) {
                    commission = total * 0.20;
                }
                reportView.showSellerSummary(seller, total, commission);
            }
        }
    }

    @Override
    public void start() {
        String moduleName = navigationRouteName();
        String[] moduleItems = new String[] { moduleName };

        int option;
        do {
            option = view.showModules(moduleName, moduleItems);
            handleOption(option);
        } while (option != 0);
    }
}