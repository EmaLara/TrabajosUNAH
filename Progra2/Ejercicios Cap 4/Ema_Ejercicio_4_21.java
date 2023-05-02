import java.util.Scanner;

public class Ema_Ejercicio_4_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int numero = 0;
        int mayor = Integer.MIN_VALUE;

        while (contador < 10) {
            System.out.print("Introduce un número entero: ");
            numero = scanner.nextInt();
            if (numero > mayor) {
                mayor = numero;
            }
            contador++;
        }

        System.out.println("El número mayor es: " + mayor);
    }
}
