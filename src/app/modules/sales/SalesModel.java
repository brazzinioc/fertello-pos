package app.modules.sales;

import java.util.ArrayList;
import java.util.List;

public class SalesModel {
    private double prices;
    private List<SalesModel> sales;

    public SalesModel(double prices) {
        this.prices = prices;
    }

    public SalesModel() {
        this.sales = new ArrayList<>();
    }

    public List<SalesModel> getSales() {
        return this.sales;
    }

    public void addSale(SalesModel sale) {
        this.sales.add(sale);
    }

}
