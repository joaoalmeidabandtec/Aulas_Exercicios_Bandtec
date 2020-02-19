
package aula.pkg02;

public class Interpolacao {

    public static void main(String[] args) {
        
        String nome= "João Vitor";
        String trabalho= "Logicalis";
        String teste= "teste";
        Integer numeroInteiro= 20;
        Double numeroDecimal= 3.141592;
        
        String texto= String.format("Olá meu nome é %s, e eu trabalho na %s.", nome,trabalho);
        
        System.out.println(texto);
        
        System.out.println(String.format("\nIsso aqui é apenas um %s, o (porcentagem s) é o que chama o texto ", teste));
        
        System.out.println(String.format("\nMinha idade é %d, o (porcentagem d) é o que chama os números inteiros.", numeroInteiro));
      
        System.out.println(String.format("\nEsse é o número pi: %.2f, o (porcentagem ponto numero de casas deciamis f) é o que chama os números decimais.", numeroDecimal));
    }
    
}
