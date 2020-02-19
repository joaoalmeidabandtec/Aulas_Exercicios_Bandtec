package lista.pkg02;

import java.util.Scanner;

public class Boletim {

    public static void main(String[] args) {
        Double nota1, nota2, nota3, media;
        
        Scanner notas = new Scanner(System.in);
        
        System.out.println("Digite sua primeira nota:");
        nota1 = notas.nextDouble();
        
        System.out.println("Digite sua segunda nota:");
        nota2 = notas.nextDouble();
        
        System.out.println("Digite sua terceira nota:");
        nota3 = notas.nextDouble();
        
        media = (nota1+nota2+nota3)/3;
        
        if(media >= 7){
            System.out.println("Passou direto!");
        }
        else if(media < 5){
            System.out.println("Reprovado direto!");
        }
        else{
            System.out.println("Têm direito de fazer uma prova de recuperação!");
        }
    }
    
}
