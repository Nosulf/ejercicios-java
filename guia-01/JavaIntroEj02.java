package javaintroej02;

//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
//pantalla.

import java.util.Scanner;

public class JavaIntroEj02 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        String nombre;
        
        System.out.println("Ingrese su nombre, por favor: ");
        nombre = read.nextLine();
        
        System.out.printf("Su nombre es: %s %n ", nombre);
    }
}
