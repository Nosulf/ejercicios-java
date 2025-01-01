package javaintroej04;

//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
//Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

import java.util.Scanner;

public class JavaIntroEj04 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        float gradosCentigrados, gradosFahrenheit;
        
        System.out.println("Ingrese una cantidad de grados centígrados: ");
        gradosCentigrados = Float.parseFloat(read.nextLine());
        
        gradosFahrenheit = 32 + (9 * gradosCentigrados / 5);
        
        System.out.printf("Su equivalente en grados Fahrenheit es: %.2f %n", gradosFahrenheit);
    }
}
