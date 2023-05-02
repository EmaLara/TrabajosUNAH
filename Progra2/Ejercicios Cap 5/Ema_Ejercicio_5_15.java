public class Ema_Ejercicio_5_15 {
    public static void main(String[] args) {
        // Patrón (a)
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Patrón (b)
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Patrón (c)
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 10; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Patrón (d)
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 10; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
