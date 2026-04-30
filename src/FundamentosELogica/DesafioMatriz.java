package FundamentosELogica;

/*

//		        IREI UNIR MATRIZ, LOOP ANINHADO E SOMA(ACUMULADOR)



O Desafio do gerente de Vendas

Imagine que você tem uma matriz que representa as vendas de uma
pequena loja durante 3 dias(linhas), e em cada dia ouve 3 vendas
 (colunas).

        int[][] vendas = {
        {100, 200, 300},
        {150, 250, 350},
        {400, 500, 600}
     };

Missão:

1- Crie uma variável int totalGeral = 0; antes dos loops.
2- Use os dois loops for (um para linha, outro para coluna) para
percorrer toda a matriz.
3- Dentro do loop mais interno, some cada valor da matriz a
variável totalGeral.
4-Ao final (fora de todos os loops), imprima o valor de vedas da loja.

 */


public class DesafioMatriz {
    public static void main (String [] args ){

// 1. Criando a matriz com os valores das vendas

        int[][] vendas = {
        {100, 200, 300},  // Dia 0
        {150, 250, 350}, // Dia 1
        {400, 500, 600}  // Dia 2
};

        int totalGeral = 0; // 2. Variável acumuladora

// 3. Loops aninhados para percorrer Linhas (i) e colunas (j)

        for (int i = 0; i < vendas.length; i++){
            for (int j = 0; j < vendas[i].length; j++) {

                // Soma o valor da posição atual ao total
                totalGeral += vendas[i][j];

                // Opcional: imprimir cada valor sendo somado para acompanhar
                System.out.println("Somando venda [" + i + "][" + j + "]: R$ " + vendas[i][j]);
            }
        }

        // 4. Resultado final fora do loop
        System.out.println("---------------------------------");
        System.out.println("FATURAMENTO TOTAL DA LOJA: R$ " + totalGeral);
    }
}
/*

//		DEBUGANDO MATRIZ COM LOOP E ACUMULADOR

Imagine que o Java é um inspetor que entra em cada sala (linha)
e abre cada gaveta (coluna):

1- Início: totalGeral é 0.

2- Linha 0(Dia 0):
. Entra na coluna 0: Soma 100. (totalGeral = 100)
. Entra na coluna 1: Soma 200. (totalGeral = 300)
. Entra na coluna 2: Soma 300. (totalGeral = 600)

3- Linha 1(Dina 1):
. Entra na coluna 0: Soma 150. (totalGeral = 750)
. Entra na coluna 1: Soma 250. (totalGeral = 1000)
. Entra na coluna 2: Soma 350. (totalGeral = 1350)

4- Linha 2(Dia 2):
. Entra na coluna 0: Soma 400. (totalGeral = 1750)
. Entra na coluna 1: Soma 500. (totalGeral = 2250)
. Entra na coluna 2: Soma 600. (totalGeral = 2850)



 */

