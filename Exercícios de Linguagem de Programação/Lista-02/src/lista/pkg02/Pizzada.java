package lista.pkg02;

import java.util.Scanner;

public class Pizzada {
    public static void main(String[] args) {
        Double valorPizza, qtdPessoas, valorMaximo, totalRachar, limiteRachar;
        String saborPizza;
        
        Scanner sabor= new Scanner(System.in);
        Scanner valor= new Scanner(System.in);
        
        System.out.println("Digite o valor de uma pizza:");
        valorPizza = valor.nextDouble();
        
        System.out.println("Digite o sabor de uma pizza:");
        saborPizza = sabor.next();
        
        System.out.println("Digite quantas pessoas vão pagar as(a) pizzas(a):");
        qtdPessoas = valor.nextDouble();
        
        System.out.println("Digite o valor máximo para divisão do pagamento:");
        valorMaximo = valor.nextDouble();
        
        totalRachar = valorPizza/qtdPessoas;
        limiteRachar = qtdPessoas*valorMaximo;
        
        if(totalRachar <= valorMaximo){
            System.out.println(String.format("A pizza de %s será dividida entre %.0f pessoas, R$%.2f p/ cada ", saborPizza, qtdPessoas, totalRachar));
        }
        else{
            System.out.println(String.format("Deu ruim. A pizza deveria custar no máximo %.2f. ", limiteRachar));
             
        }
    }
    
}
