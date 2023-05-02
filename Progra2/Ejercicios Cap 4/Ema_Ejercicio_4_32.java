public class Ema_Ejercicio_4_32 {
    public static void main(String[] args) {
        for (int fila = 1; fila <= 8; fila++) {
            for (int columna = 1; columna <= 8; columna++) {
                if ((fila + columna) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
