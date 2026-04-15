package FundamentosELogica;


/*
                                     SWITCH CASE

O switch (ou switch-case) é como se fosse um "atalho" para o if/else
quando você tem muitas opções fixas para testar. Em vez de fazer várias
perguntas de "maioir ou menor", p switch olha para uma váriável e pula direto
para o "case" correspondente.

1- A Teoria
Imagine um menu de um Totem de Lanchonete. O usuário digita um número e o
programa escolhe o produto.

. switch(variavel): É onde você coloca a variável que quer testar.
. Case: são as opções possíveis.
. break: Fundamental! Ele serve para "parar" o código. Se você esquecer o
break, o Java vai executando todos os casos abaixo sem parar.
. default: É o "senão" do switch. Se o usuário digitar algo que não está nos
casos, ele cai aqui.


//			EXEMPLO DE ESTRUTURA COMPLETA

Aqui está uma estrutura do exemplo de lanchonete:

public class ExemploSwitch{
    public static void main (String [] args){

        int opcao = 2;

// O switch avalia o valor exato da variável 'opcao'

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu Hambúguer.");
                break; // O break sai do swhitch após executar o caso
            case 2:
                System.out.println("Você escolheu Batata Frita.");
                break;
            case 3:
                System.out.println("Você escolheu refrigerante.");
                break;
            default:
// O default é executado se nenhum dos casos acima for atendido
                System.out.println("Opção inválida!");
                break;
        }
    }
}

O que precisa saber sobre essa estrutura:
        . A variável de controle: No switch (opcao), a variável dentro dos
parênteses deve ser do tipo int, char, byte, short ou String. Ela não
aceita double ou float.
        . O papel do break: Imagine que o switch é um elevador. O case é o andar
onde você quer descer. O break é a porta se abrindo. Se você não colocar o
break, o elevador continua descendo e "atropelando" todos os andares de
baixo.
. O default: Ele é opcional, mas é uma boa prática de programação para
tratar erros ou entradas inesperadas do usuário.
      */

// 			EXERCICIO PRÁTICO

public class EstruturaSwitch{
    public static void main(String [] args){

        int dias = 7;
        switch (dias){

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
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;

            default:
                System.out.println("Dia inválido");
                break;
        }
    }
}





