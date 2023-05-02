import java.util.Scanner;
  
public class Ema_Ejercicio_2_24 {          
    public static void main( String args[]) {         
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;
        
        System.out.println("\nEste programa lee cinco numeros y devuelve el mayor y el menor. ");
        System.out.println("Por favor introduzca el primer numero:");
        numero1 = entrada.nextInt();
        
        System.out.println("\nPor favor introduzca el segundo entero:");
        numero2 = entrada.nextInt();
        
        System.out.println("\nPor favor introduzca el tercer entero:");
        numero3 = entrada.nextInt();
        
        System.out.println("\nPor favor introduzca el cuarto entero:");
        numero4 = entrada.nextInt();
        
        System.out.println("\nPor favor introduzca el quinto entero:");
        numero5 = entrada.nextInt();
        
        
        int menor = numero1;
        
        if ( numero2 < menor)
        menor = numero2;
        if ( numero3 < menor)
        menor = numero3;
        if (numero4 < menor)
        menor = numero4;
        if (numero5 < menor)
        menor = numero5;

        
        int mayor = numero1;
        
        if (numero2 > mayor)
        mayor = numero2;
        if (numero3 > mayor)
        mayor = numero3;
        if (numero4 > mayor)
        mayor = numero4;
        if(numero5 > mayor)
        mayor = numero5;


        System.out.printf("\nEl menor de los numeros es: %d\n", menor);
        System.out.printf("\nEl mayor de los numeros es: %d\n", mayor);
    }
}