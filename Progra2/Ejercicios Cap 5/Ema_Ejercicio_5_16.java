import java.util.Scanner;

public class Ema_Ejercicio_5_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese un número entre 1 y 30: ");
            num = input.nextInt();
            
            if (num < 1 || num > 30) {
                System.out.println("Número inválido. Intente de nuevo.");
                i--; // disminuir i para que se pida el número de nuevo
            } else {
                for (int j = 1; j <= num; j++) {
                    System.out.print("*");
                }
                System.out.println(); // nueva línea después de cada serie de asteriscos
            }
        }
        
        input.close(); // cerrar el objeto Scanner
    }
}
