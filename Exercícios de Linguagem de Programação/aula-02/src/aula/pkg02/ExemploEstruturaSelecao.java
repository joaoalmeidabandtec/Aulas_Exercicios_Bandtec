package aula.pkg02;

import java.util.Random;
import java.util.Scanner;

public class ExemploEstruturaSelecao {

    public static void main(String[] args) {
        Integer idade, numero, valorDado, chute, diaSemana, lugar;
        String nomeFacul;
        Random aleatorio = new Random();

        Scanner leitura = new Scanner(System.in);

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        idade = leitor.nextInt();

        if (idade >= 18) {
            System.out.println("Você já pode tirar a Carteira de Habilitação!");
        }

        System.out.println("Digite um número inteiro:");
        numero = leitor.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é ímpar");
        }

        System.out.println("Digite um número inteiro:");
        numero = leitor.nextInt();
        if (numero % 2 != 0) {
            System.out.println(numero + " é ímpar");
        } else {
            System.out.println(numero + " é par");
        }

        System.out.println("Digite o nome da sua Faculdade:");
        nomeFacul = leitura.nextLine();

//        equals é um comparador, não pode usar o == em texto.
        if (nomeFacul.equals("Bandtec Digital School")) {
            System.out.println("Parabéns, ótima escolha!");
        }

//      Número Aleatório, tipo um dado.
        valorDado = aleatorio.nextInt(6) + 1;
        System.out.println("Tente adivinhar o valor do dado!");
        chute = leitor.nextInt();

        if (!chute.equals(valorDado)) {
            System.out.println("Não foi dessa vez!");
        } else {
            System.out.println("Parabéns! Você acertou!");
        }
        System.out.println("O valor do dado é: " + valorDado);

//        Switch case, if e else frufru!
        System.out.println("Digite um número de 1 a 7");
        diaSemana = leitor.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número Invalido");
                break;
        }

//        Caso legal onde o break não é utilizado e ajuda.
        System.out.println("Digite a sua colocação:" + "1ºLugar - Ganha: Iphone, Ipad e Ipod"
                + " 2ºLugar - Ganha: Ipad e Ipod"
                + " 3ºLugar - Ipod");

        lugar = leitor.nextInt();

        System.out.println("Você ganhou:");
        switch (lugar) {
            case 1:
                System.out.println(" um Iphone,");
            case 2:
                System.out.println(" um Ipad e");
            case 3:
                System.out.println(" um Ipod!");
                break;
            default:
                System.out.println(" nada.");
                break;
        }
 
        
    }
}
