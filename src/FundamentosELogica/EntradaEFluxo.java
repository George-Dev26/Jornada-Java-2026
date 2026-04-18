package FundamentosELogica;

/*
                    PRÁTICANDO (FOR)

public class EntradaEFluxo {
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

   O que o programa deve fazer:

1- Pedir o valor inicial (ex: 10).
2- Pedir o valor final (ex: 50).
3- pedir o incremento (ex: 5).


    Passo a Passo da LÓGICA:

1- Variáveis de Entrada: Use o Scanner para guardar três números inteiros: inicio, fim e salto.
2- Montando o Motor (for):
. Início: Em vez de int i = 0, você vai usar int i = inicio;
. Condição: O loop deve rodar enquanto i <= fim; .
. Passo: Aqui está o segredo! Use i += salto; .
3- Dentro do Loop: Imprima o valor atual de i.

 */

import java.util.Scanner;

    public class EntradaEFluxo{
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


