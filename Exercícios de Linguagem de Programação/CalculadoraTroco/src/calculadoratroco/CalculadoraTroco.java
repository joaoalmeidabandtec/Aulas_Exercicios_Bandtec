package calculadoratroco;

import java.util.Scanner;

public class CalculadoraTroco {

    public static void main(String[] args) {
        Double valorProduto, valorPago, totalProdutos;
        Integer qtdeProdutos;
        
        Scanner n= new Scanner (System.in);
        
        System.out.println("Digite o valor de um produto:");
        valorProduto= n.nextDouble();
        
        System.out.println("Digite a quantidade vendida para o cliente:");
        qtdeProdutos= n.nextInt();
        
        System.out.println("Digite o valor pago pelo cliente:");
        valorPago= n.nextDouble();
        
        totalProdutos= valorProduto*qtdeProdutos;
        
        System.out.println(String.format("Seu troco é de R$%.2f",(valorPago-totalProdutos))) ;
                
    }
    
}
