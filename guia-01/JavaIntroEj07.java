package javaintroej07;

//Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
//pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
//investigar la función equals() en Java.

import java.util.Scanner;

public class JavaIntroEj07 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        String frase, evaluacion;
        
        System.out.println("Ingrese una frase, por favor: ");
        frase = read.nextLine();
        
        evaluacion = frase.equals("eureka") ? "Correcto" : "Incorrecto";
        
        System.out.println(evaluacion);
    }
}
