import java.util.Scanner;

public class Ema_Ejercicio_4_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilometros;
        int litros;
        int totalKilometros = 0;
        int totalLitros = 0;

        System.out.print("Ingresa los kilómetros conducidos (-1 para salir): ");
        kilometros = scanner.nextInt();

        while (kilometros != -1) {
            System.out.print("Ingresa los litros usados: ");
            litros = scanner.nextInt();

            double kilometrosPorLitro = (double) kilometros / litros;
            System.out.printf("Kilómetros por litro en este viaje: %.2f%n", kilometrosPorLitro);

            totalKilometros += kilometros;
            totalLitros += litros;
            double promedioKilometrosPorLitro = (double) totalKilometros / totalLitros;
            System.out.printf("Kilómetros por litro en todos los viajes: %.2f%n", promedioKilometrosPorLitro);

            System.out.print("Ingresa los kilómetros conducidos (-1 para salir): ");
            kilometros = scanner.nextInt();
        }
    }
}
