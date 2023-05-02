import java.util.Scanner;

public class Ema_Ejercicio_4_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        while (numero < 10000 || numero > 99999) {
            System.out.print("Introduzca un entero de cinco dígitos: ");
            numero = scanner.nextInt();

            if (numero < 10000 || numero > 99999) {
                System.out.println("Error: el número debe tener cinco dígitos.");
            }
        }

        int digito1 = numero / 10000;
        int digito2 = (numero % 10000) / 1000;
        int digito4 = (numero % 100) / 10;
        int digito5 = numero % 10;

        if (digito1 == digito5 && digito2 == digito4) {
            System.out.println(numero + " es un palíndromo.");
        } else {
            System.out.println(numero + " no es un palíndromo.");
        }
    }
}
