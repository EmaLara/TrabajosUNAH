import java.util.Scanner;
   
public class Ema_Ejercicio_2_26 {
    public static void main(String arg[]) {
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        int mayor;
        int menor;
        
        System.out.println("\nEscribe dos números enteros y verifica si uno es multiplo del otro.");
        System.out.println("Por favor introduzca el primer número:");
        numero1 = entrada.nextInt();
        
        System.out.println("Por favor introduzca el segundo número:");
        numero2 = entrada.nextInt();


        mayor = numero1;
        menor = numero2;
        
        if ( numero2 > numero1 ) {
            mayor = numero2;
            menor = numero1;
        }

        if ( 0 == mayor % menor )
            System.out.printf("\nEl numero %d es multiplo del numero %d\n", mayor, menor);
        
        if ( 0 != mayor % menor )
            System.out.println("\nLos numeros no son multiplos.");   
    }
}