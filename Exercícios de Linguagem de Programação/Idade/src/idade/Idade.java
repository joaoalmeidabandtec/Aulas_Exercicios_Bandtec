package idade;

import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {
        
        String nome;
        Double ano;
        
        Scanner s= new Scanner(System.in);
        
        Scanner n= new Scanner(System.in);
        
        System.out.println("Qual é seu nome?");
        nome= s.nextLine();
        
        System.out.println(String.format("\nOlá %s! Qual o ano do seu nascimento?", nome));
        ano= n.nextDouble();
        
        System.out.println(String.format("\nEm 2030 você terá %.0f anos!", (2030-ano)) );
    }
    
}
