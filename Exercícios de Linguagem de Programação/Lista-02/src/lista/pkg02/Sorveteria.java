
package lista.pkg02;

import java.util.Scanner;

public class Sorveteria {

    public static void main(String[] args) {
        String tipoSorvete;
        
        Scanner sorvete = new Scanner(System.in);
        
        System.out.println("Digite sua opção de produto: Casquinha, "
                                                      + "Sundae, "
                                                      + "Milkshake.");
        tipoSorvete = sorvete.nextLine();
        
        switch (tipoSorvete) {
            case "Casquinha": System.out.println("Custa R$2,00");
                break;
            
            case "Sundae": System.out.println("Custa R$5,00");
                break;
                
            case "Milkshake": System.out.println("Custa R$7,00");    
                break;
            
            default: System.out.println("Digite uma opção válida.");
                break;
        }
        
    }
    
}
