import java.util.Scanner;

public class Ema_Ejercicio_5_17 {

    public static void main(String[] args) {
        // precios de los productos
        double precioProducto1 = 2.98;
        double precioProducto2 = 4.50;
        double precioProducto3 = 9.98;
        double precioProducto4 = 4.49;
        double precioProducto5 = 6.87;
        
        Scanner entrada = new Scanner(System.in);
        
        int numeroProducto = 0;
        int cantidadVendida = 0;
        double totalVentas = 0.0;
        
        // ciclo controlado por centinela
        while (true) {
            System.out.print("Introduzca el número del producto (1-5) o -1 para salir: ");
            numeroProducto = entrada.nextInt();
            
            // si el usuario introduce -1, se sale del ciclo
            if (numeroProducto == -1) {
                break;
            }
            
            System.out.print("Introduzca la cantidad vendida: ");
            cantidadVendida = entrada.nextInt();
            
            // determinar el precio de venta del producto
            double precioVenta = 0.0;
            
            switch (numeroProducto) {
                case 1:
                    precioVenta = precioProducto1;
                    break;
                case 2:
                    precioVenta = precioProducto2;
                    break;
                case 3:
                    precioVenta = precioProducto3;
                    break;
                case 4:
                    precioVenta = precioProducto4;
                    break;
                case 5:
                    precioVenta = precioProducto5;
                    break;
                default:
                    System.out.println("Número de producto inválido");
                    continue; // vuelve al inicio del ciclo
            }
            
            // calcular y mostrar el valor total de venta del producto
            double valorVenta = precioVenta * cantidadVendida;
            System.out.printf("El valor de venta del producto %d es: $%.2f\n", numeroProducto, valorVenta);
            
            // sumar al total de ventas
            totalVentas += valorVenta;
        }
        
        // mostrar el total de ventas
        System.out.printf("El total de ventas es: $%.2f\n", totalVentas);
    }

}
