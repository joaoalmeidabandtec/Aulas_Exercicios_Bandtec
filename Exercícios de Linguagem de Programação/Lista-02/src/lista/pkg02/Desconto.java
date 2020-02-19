
package lista.pkg02;

import java.util.Scanner;

public class Desconto {

    public static void main(String[] args) {
        Double valorProduto, cupom1, cupom2, cupom3, cupom4;
        Integer codigoDesconto;
        
        Scanner valor = new Scanner (System.in);
        
        System.out.println("Digite o valor do produto:");
        valorProduto = valor.nextDouble();
        
        System.out.println("Digite o código promocional:");
        codigoDesconto = valor.nextInt();
        
        cupom1 = valorProduto - ((valorProduto*5)/100);
        cupom2 = valorProduto - ((valorProduto*10)/100);
        cupom3 = valorProduto - ((valorProduto*20)/100);
        cupom4 = valorProduto - ((valorProduto*50)/100);
        
        System.out.println(String.format("O valor do produto sem desconto é de R$%s", valorProduto));
        
        switch (codigoDesconto){
            case 1: System.out.println(String.format("O novo valor do seu produto é de R$%s",cupom1 ));
                break;
            case 2: System.out.println(String.format("O novo valor do seu produto é de R$%s",cupom2 ));
                break;
            case 3: System.out.println(String.format("O novo valor do seu produto é de R$%s",cupom3 ));
                break;    
            case 4: System.out.println(String.format("O novo valor do seu produto é de R$%s",cupom4 ));
                break;
            default:System.out.println("Código Inválido.");
        }
        
        
    }
    
}
