import java.util.Scanner;

public class Ema_Ejercicio_4_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.printf("Empleado #%d:%n", i);
            System.out.print("Horas trabajadas: ");
            int horasTrabajadas = scanner.nextInt();
            System.out.print("Tarifa por horas: ");
            double tarifaPorHoras = scanner.nextDouble();

            double sueldoBruto;
            if (horasTrabajadas <= 40) {
                sueldoBruto = horasTrabajadas * tarifaPorHoras;
            } else {
                int horasExtras = horasTrabajadas - 40;
                sueldoBruto = 40 * tarifaPorHoras + horasExtras * tarifaPorHoras * 1.5;
            }

            System.out.printf("Sueldo bruto: $%.2f%n%n", sueldoBruto);
        }
    }
}
