package FundamentosELogica;

/*
//                          ESTRUTURA COMPLETA: SISTEMA DE MENU

import java.util.Scanner;

public class MenuInterativo {
    public static void main (String [] args ) {

        Scanner leitor = new Scanner(System.in);
        int opcao = -1; // Iniciamos com o valor que não seja 0

// Enquanto a opção for diferente de 0,o programa continua rodando
        while (opcao != 0) {
            System.out.println("==== Menu de Operações ====");
            System.out.println("1. Saldar usúario");
            System.out.println("2. Ver data atual");
            System.out.println("0. Sair do sistema");
            System.out.println("Escolha uma opção: ");

            opcao = leitor.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Olá!  Bem-vindo ao sistema.");
                    break;
                case 2:
                    System.out.println("Hoje é dia 16 de Abril de 2026.");
                    break;
                case 0:
                    System.out.println("Saindo... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
        leitor.close();
    }
}


    O Passo a Paaso da Lógica:

1- A Varável de Controle: Criamos int opcao. Ela precisa começar com um valor que
não seja o de saída (no caso, começamos com -1  porque o 0 é para sair).
2- A Condição do while: O Java checa: "A opcao é diferente de 0?". Se sim, ele entra no
loop e desenha o menu na tela.
3- A Captura da Escolha: O leitor.nextInt() atualiza o valor de opcao com o que o
usúario digitar.
4- O processamento: O switch olha o número e executa a tarefa correspondente.
5- O Ciclo: Após o break do switch, o código volta para o topo do while. Se o usúario
digitou 0, a condição 0 != 0 torna-se falsa, e o programa finalmente encerra.

Por que isso é importante ?
 Esse é o esqueleto de quase todo o sistema profissional (CLI - Command Line Interface ). Você
mantém o usúario dentro de um ciclo de utilidade até qu7e ele decida parar.

 */

/*
                    PRÁTICANDO (FOR)

public class MenuInterativo {
    public static void main (String [] args){
        System.out.println("O Contador de pares ficará assim:");

        for (int i = 0; i <= 20; i += 2){ // Isso faz o i pular de 2 em 2, pegando só os pares.)

            System.out.println( i );
        }

    }
}

// Ao usar o (i += 2), você terá controle total sobre o "ritmo" do loop, não ficando preso apenas ao i++.

*/


//                                  INTEGRANDO ENTRADA DE DADOS COM CONTROLE DE FLUXO

/*
    Passo a Passo da LÓGICA:
1- Variáveis de Entrada: Use o Scanner para guardar três números inteiros: inicio, fim e salto.

2- Montando o Motor (for):
. Início: Em vez de int i = 0, você vai usar int i = inicio;
. Condição: O loop deve rodar enquanto i <= fim; .
. Passo: Aqui está o segredo! Use i += salto; .

3- Dentro do Loop: Imprima o valor atual de i.

 */

import java.util.Scanner;

public class MenuInterativo{
    public static void main (String [] args ){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Me diga o valor inicial:");
        int inicio = leitor.nextInt();

        System.out.print("Me diga o valor final:");
        int fim = leitor.nextInt();

        System.out.print("Me diga o valor do incremento:");
        int salto = leitor.nextInt();

         for ( int i = inicio; i <= fim; i += salto){
             System.out.println( i );
         }

    }
}































