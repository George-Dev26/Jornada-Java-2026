package FundamentosELogica;
/*
                                OPERADORES LÓGICOS

 Os Operadores Lógicos são o "próximo nível" da
tomada de decisão. Eles permitem que você teste
mais de uma condição dentro do mesmo if.
 Pense neles como as palavras "E" e "OU" que usamos
no dia a dia.

        1- Os Três Operadores principais

 && E(AND): só é verdade se todas as condições forem verdadeiras.
 exemplo : idade >= 18 && temIgresso == true

        || OU (OR)

 ! NÃO(NOT): Ele inverte o valor (o que é true vira false e vice-versa).
 exemplo : !temDivida (se NÃO tem dívida)


2- Exemplo prático: Sistema de cinema (Meia-Entrada)
Vamos ver como isso ficaria na estrutura completa de uma classe:




// 			            EXEMPLO PRÁTICO


public class RegraCinema{
    public static void main (String[] args) {

        int idade = 20;
        boolean temCarteirinha = true;

//Regra: Para ter meia-entrada, deve ser menor de 21 ANOS OU ter carteirinha
        if (idade < 21 || temCarteirinha == true){
            System.out.println("Você tem direito a Meia-Entrada!");
        } else {
            System.out.println("Você paga Inteira.");
        }


// Regra: Para entrar em filme VIP, deve ser maior de 18 E ter pago o valor VIP

        boolean pagouVip = true;
        if (idade >= 18 && pagouVip) {
            System.out.println("Acesso liberado à Sala VIP.");
}
        }
    }


Dicas precisas:
. Curto-circuito: No Java, se você usa && e a primeira condição
já é falsa, o Java nem olha a segunda(ele já sabe que vai dar falso).
O mesmo vale para o || se a primeira for verdadeira.
. Boas práticas: Quando usamos variáveis do tipo boolean, não
precisamos escrever == true. O Java entende que if (temCarteirinha)
já é um teste de verdade.

        */


// 			            EXERCÍCIO PRÁTICO

import java.util.Scanner;

public class OperadoresLogico {       // O nome da class é SistemaChurrasco
    public static void main (String [] args ){

        Scanner leitor = new Scanner(System.in);

        System.out.println("=== Bem-vindo ao Churrasco ===");

        // Entrada de dados
        System.out.print("Trouxe a carne? (true/false): ");
        boolean temCarne = leitor.nextBoolean();

        System.out.print("Trouxe a bebida? (true/false): ");
        boolean temBebida = leitor.nextBoolean();

        System.out.print("Você é o dono da casa? (true/false): ");
        boolean Dono = leitor.nextBoolean();

        // A Lógica com Operadores Lógicos
        // (Regra 1: Carne E Bebida) OU (Regra 2: Ser o Dono)

        if ((temCarne && temBebida) || Dono) {
            System.out.println(" Acesso Liberado! Bom churrasco!");
        } else {
            System.out.println(" Acesso Negado! Está faltando algo!");
        }

        leitor.close();

    }
}


































