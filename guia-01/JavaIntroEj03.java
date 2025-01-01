package javaintroej03;

//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
//en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
//Java.

import java.util.Scanner;

public class JavaIntroEj03 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingrese una frase, por favor: ");
        frase = read.nextLine();
        
        System.out.printf("La frase original es: %1$s %n"
                + "La frase en mayúsculas: %2$s %n" +
                "La frase en minúsculas: %3$s %n", frase, frase.toUpperCase(), frase.toLowerCase());
    }
}
