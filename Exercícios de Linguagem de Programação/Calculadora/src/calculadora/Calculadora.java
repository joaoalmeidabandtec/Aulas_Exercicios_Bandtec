package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
    Double numero1,numero2;
    
        Scanner leitor= new Scanner(System.in);
        
        System.out.println("Digite um número:");
        numero1= leitor.nextDouble();
        
        System.out.println("Digite outro número:");
        numero2= leitor.nextDouble();
        
        System.out.println("\nO resultado da soma é:" +(numero1+numero2));
        System.out.println("O resultado da substração é:" +(numero1-numero2));
        System.out.println("O resultado da multiplicação é:" +(numero1*numero2));
        System.out.println("O resultado da divisão é:" +(numero1/numero2));
    }
    
}
