import java.util.Scanner;

public class Ema_Ejercicio_2_17 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        int uno,dos,tres;

        System.out.print("Ingrese el primer numero: \n");
            uno=teclado.nextInt();

        System.out.print("Ingrese el segundo numero: \n");
            dos=teclado.nextInt();

        System.out.print("Ingrese el tercer numero: \n");
            tres=teclado.nextInt();

        System.out.printf("Promedio: %d%n",(uno+dos+tres)/3);
        System.out.printf("Producto: %d%n",uno*dos*tres);


        if (uno > dos && uno > tres)
            System.out.printf("El numero mayor es: %d%n",uno);

        if (dos > uno && dos > tres)
            System.out.printf("El numero mayor es: %d%n",dos);

        if (tres > uno && tres > dos)
            System.out.printf("El numero mayor es: %d%n",tres);

        if (uno < dos && uno < tres)
            System.out.printf("El numero menor es: %d%n",uno);

        if (dos < uno && dos < tres)
            System.out.printf("El numero menor es: %d%n",dos);

        if (tres < uno && tres < dos)
            System.out.printf("El numero menor es: %d%n",tres);

        if (uno == dos && uno > tres)
            System.out.printf("Los numeros mayores son: %d y %d%n",uno,dos);

        if (uno==tres && uno > dos)
            System.out.printf("Los numeros mayores son: %d y %d%n",uno,tres);

        if (dos == tres && tres > uno)
            System.out.printf("Los numeros mayores son: %d y %d%n",dos,tres);

        if (uno == dos && uno < tres)
            System.out.printf("Los numeros menores son: %d y %d%n",uno,dos);

        if (uno==tres && uno < dos)
            System.out.printf("Los numeros menores son: %d y %d%n",uno,tres);

        if (dos == tres && tres < uno)
            System.out.printf("Los numeros menores son: %d y %d%n",dos,tres);

        if (uno == tres && dos == tres)
            System.out.printf("Los 3 numeros son iguales");
        }
}