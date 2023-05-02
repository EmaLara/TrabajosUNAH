public class Ema_Ejercicio_5_13 {
    public static void main(String[] args) {
        System.out.printf("%-20s%s%n", "Número", "Factorial");
        for (int i = 1; i <= 20; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.printf("%-20d%d%n", i, factorial);
        }
    }
}
