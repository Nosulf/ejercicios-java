package javaintroej01;

//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
//dos. El programa deberá después mostrar el resultado de la suma

import java.util.Scanner;

public class JavaIntroEj01 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int num1, num2, resultado;
        
        System.out.println("Ingrese el primero entero, por favor: ");
        num1 = Integer.parseInt(read.nextLine());
        
        System.out.println("Ingrese el segundo entero, por favor: ");
        num2 = Integer.parseInt(read.nextLine());
        
        resultado = num1 + num2;
        
        System.out.println("Resultado: " + resultado);
        
        System.out.printf("Resultado: %1$d + %2$d = %3$d %n", num1, num2, resultado);
    }
}
