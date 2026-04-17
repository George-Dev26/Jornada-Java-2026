package FundamentosELogica;


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

/*
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







