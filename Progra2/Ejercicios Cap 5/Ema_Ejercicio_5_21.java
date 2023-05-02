public class Ema_Ejercicio_5_21 {
    public static void main(String[] args) {
        int maxLado = 500;
        System.out.printf("%7s %7s %10s%n", "Lado 1", "Lado 2", "Hipotenusa");
        for (int lado1 = 1; lado1 <= maxLado; lado1++) {
            for (int lado2 = 1; lado2 <= maxLado; lado2++) {
                for (int hipotenusa = 1; hipotenusa <= maxLado; hipotenusa++) {
                    if (lado1 * lado1 + lado2 * lado2 == hipotenusa * hipotenusa) {
                        System.out.printf("%7d %7d %10d%n", lado1, lado2, hipotenusa);
                    }
                }
            }
        }
    }
}
