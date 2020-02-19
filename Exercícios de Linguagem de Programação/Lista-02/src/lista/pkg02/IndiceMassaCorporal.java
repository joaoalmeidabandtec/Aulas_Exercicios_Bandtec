package lista.pkg02;

import java.util.Scanner;

public class IndiceMassaCorporal {

    public static void main(String[] args) {
        Double pesoUsuario, alturaUsuario, total;
        String sexo;
        
        Scanner valor = new Scanner (System.in);
        Scanner leitura = new Scanner (System.in);
        
        System.out.println("Digite sua altura:");
        alturaUsuario = valor.nextDouble();
        
        System.out.println("Diigte seu peso:");
        pesoUsuario = valor.nextDouble();
        
        System.out.println("Digite seu sexo: Homem ou Mulher.");
        sexo = leitura.next();
        
        total = pesoUsuario/(alturaUsuario*alturaUsuario);
        
        if(sexo.equals("Mulher")){
            if(total > 32.3){
                System.out.println("Obeso!");
            }
            else if(total < 19.1){
                System.out.println("Abaixo do peso!");
            }
            else if(total >= 19.1 || total < 25.8){
                System.out.println("No peso normal!");
            }
            else if(total >= 25.8 || total < 27.3){
                System.out.println("Marginalmente acima do peso");
            }
            else{
                System.out.println("Acima do peso ideal!");
            }
        }
                if(sexo.equals("Homem")){
            if(total > 31.1){
                System.out.println("Obeso!");
            }
            else if(total < 20.7){
                System.out.println("Abaixo do peso!");
            }
            else if(total >= 20.7 || total < 26.4){
                System.out.println("No peso normal!");
            }
            else if(total >= 26.4 || total < 27.8){
                System.out.println("Marginalmente acima do peso");
            }
            else{
                System.out.println("Acima do peso ideal!");
            }
        }
    }
    
}
