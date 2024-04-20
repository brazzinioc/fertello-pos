package mock;

public class Screen {
    public static void main(String[] args) {
        // Start Menu de seleccion de productos
        System.out.println("Ingrese el número del producto a fabricar o ingrese S para salir:\n");
        System.out.println("------------------------------------------------------------\n");
        System.out.println(
                "1: Producto SKU001\nColor: Negro\nModelo: Clásica\nColección: Colección Elegance\nGénero: Unisex\nTamaño: Grande");
        System.out.println("------------------------------------------------------------");
        System.out.println(
                "2: Producto SKU002\nColor: Marrón\nModelo: Con broche\nColección: Colección Vintage\nGénero: Masculino\nTamaño: Mediano");
        System.out.println("------------------------------------------------------------");
        System.out.println(
                "3: Producto SKU003\nColor: Azul\nModelo: Bifold\nColección: Colección Moderna\nGénero: Femenino\nTamaño: Pequeño");
        System.out.println("------------------------------------------------------------");
        System.out.println(
                "4: Producto SKU004\nColor: Rojo\nModelo: Minimalista\nColección: Colección Urban\nGénero: Unisex\nTamaño: Pequeño");
        System.out.println("------------------------------------------------------------");
        System.out.println(
                "5: Producto SKU005\nColor: Verde\nModelo: Con cierre\nColección: Colección Adventure\nGénero: Masculino\nTamaño: Mediano");
        System.out.println("------------------------------------------------------------");
        System.out.println(
                "6: Producto SKU006\nColor: Gris\nModelo: Trifold\nColección: Colección Classic\nGénero: Femenino\nTamaño: Grande");
        System.out.println("------------------------------------------------------------");
        System.out.println(
                "7: Producto SKU007\nColor: Café\nModelo: Con grabado\nColección: Colección Vintage\nGénero: Unisex\nTamaño: Mediano");
        // End Menu de seleccion de productos

        // Start Menu de bienvenida
        System.out.println("------------------------------------------------------------\n");
        System.out.println("Bienvenido a CUEROS FERTELLO S.A.C.\n");
        System.out.println("------------------------------------------------------------\n");
        System.out.println("Seleccione su rol de usuario: Ingrese A, V o P\n");
        System.out.println("A: Administración");
        System.out.println("V: Ventas");
        System.out.println("P: Producción");
        System.out.println("S: Salir\n");
        System.out.println("------------------------------------------------------------\n");
        // End Menu de bienvenida

        // Start Menu de Administración
        System.out.println("Administración / Inicio\n");
        System.out.println("------------------------------------------------------------\n");
        System.out.println("Seleccione el modulo a consultar:\n");
        System.out.println("I: Inventario");
        System.out.println("V: Reporte de Ventas");
        System.out.println("P: Pedidos");
        System.out.println("F: Producción");
        System.out.println("S: Salir\n");
        System.out.println("------------------------------------------------------------\n");
        // End Menu de Administración

        // Start Menu de Ventas
        System.out.println("Ventas / Inicio\n");
        System.out.println("------------------------------------------------------------\n");
        System.out.println("Seleccione el modulo a consultar:\n");
        System.out.println("R: Registrar nueva venta");
        System.out.println("C: Consulta de Ventas");
        System.out.println("T: Ventas totales");
        System.out.println("S: Salir\n");
        System.out.println("------------------------------------------------------------\n");
        // End Menu de Ventas

        // Start Menu de Producción
        System.out.println("Producción / Inicio\n");
        System.out.println("------------------------------------------------------------\n");
        System.out.println("Seleccione el modulo a consultar:\n");
        System.out.println("P: Producir nuevo producto");
        System.out.println("C: Consulta de producto fabricados");
        System.out.println("S: Salir\n");
        System.out.println("------------------------------------------------------------\n");
        // End Menu de Producción
    }

}
