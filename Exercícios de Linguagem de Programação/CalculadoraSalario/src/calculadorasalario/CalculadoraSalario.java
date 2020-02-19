package calculadorasalario;

import java.util.Scanner;

public class CalculadoraSalario {

    public static void main(String[] args) {
        Double salario, imposto, calculoImposto, total;
        
        Scanner in= new Scanner(System.in);
        
        System.out.println("Digite o seu salário:");
        salario= in.nextDouble();
        
        System.out.println("Digite a porcentagem de imposto sobre seu salário:");
        imposto= in.nextDouble();
        
        calculoImposto= (salario*imposto)/100;
        
        total= salario-calculoImposto;
        
        System.out.println(String.format("Seu salário é de R$%s", (total)));
    }
    
}
