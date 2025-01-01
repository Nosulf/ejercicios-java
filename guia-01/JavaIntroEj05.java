package javaintroej05;

//Escribir un programa que lea un número entero por teclado y muestre por pantalla el
//doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
//Math.sqrt().

import java.util.Scanner;

public class JavaIntroEj05 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int numEntero;
        
        System.out.println("Ingrese un entero, por favor: ");
        numEntero = Integer.parseInt(read.nextLine());
        
        System.out.printf("Número original: %1$d %n"
                + "El doble: %2$d %n"
                + "El triple: %3$d %n"
                + "Raíz cuadrada: %4$d %n" , numEntero, numEntero * 2, numEntero * 3, (int) Math.sqrt(numEntero));
    }
}
