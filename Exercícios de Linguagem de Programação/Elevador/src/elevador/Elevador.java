package elevador;

import java.util.Scanner;

public class Elevador {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        
            Double limitePeso, total;
        
            Integer limitePessoa;
            
            System.out.println("Digite o limite de peso do elevador:");
            limitePeso= in.nextDouble();
            
            System.out.println("Digite um limite de pessoas para esse elevador: ");
            limitePessoa= in.nextInt();
            
            System.out.println("Digite o peso da 1ª pessoa:");
            total= in.nextDouble();
            
            System.out.println("Digite o peso da 2ª pessoa:");
            total += in.nextDouble();
            
            System.out.println("Digite o peso da 3ª pessoa:");
            total += in.nextDouble();
            
            System.out.println(String.format("Entraram 3 pessoas no elevador, no qual cabem %s pessoas. O peso total no elevador é de %s, sendo que ele suporta %s", limitePessoa, total, limitePeso));
    }
    
}
