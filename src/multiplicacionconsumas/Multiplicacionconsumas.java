/*
hacer un programa que lea dos numeros enteros y luego imprima su multiplicacion (se debe realizar atravez de sumas 
 */
package multiplicacionconsumas;

import java.util.Scanner;

/**
 *
 * @author luistorresco
 */
public class Multiplicacionconsumas {

    /**
     
     */
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        int num1, num2, suma;
        suma=0;
        System.out.println("\n ingrese un numero a multiplicar");
        num1=objread.nextInt();
        System.out.println("\n ingrese el otro numero a multiplicar");
        num2=objread.nextInt();
        for (int i = 1; i <=num2; i++) { 
             suma =suma + num1;  
        }
        System.out.println("el resultado es " + suma);
    }
    
}
