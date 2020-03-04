
import java.util.Scanner;

public class AvaliacaoContinuada1 {
    public static void main(String[] args) {
        String nome;
        Double notas = 0.00, saldo= 0.00;
        
        Scanner usuario = new Scanner(System.in);
        Scanner dinheiro = new Scanner(System.in);
        
        
        System.out.println("Digite seu primeiro nome:");
        nome = usuario.next();

        for (Integer qtd = 0; qtd < 12; qtd++) {
            
            System.out.println("Qual valor do depósito?:");
            notas = dinheiro.nextDouble();
            
            if (notas == 2) {
                saldo = notas + saldo;
            }else{saldo += 0;}
            
            if (notas == 5) {
                saldo = notas + saldo;  
            }else{saldo += 0;}
            
            if (notas == 10) {
                saldo = notas + saldo;
            }else{saldo += 0;}            
            
            if (notas == 20) {
                saldo = notas + saldo;
            }else{saldo += 0;}
            
            if (notas == 50) {
                saldo = notas + saldo;
            }else{saldo += 0;}            
            
            if (notas == 100) {
                saldo = notas + saldo; 
            }else{saldo += 0;}            
        }
        System.out.println(String.format("Ao final de 12 meses, %s guardou R$%.2f", nome, saldo));
        
    }
}