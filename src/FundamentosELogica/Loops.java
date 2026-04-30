package FundamentosELogica;

/*

                                AUTOMATIZANDO COM LOOPS

 Em vez de preencher manualmente casa por casa (o que dá muito
trabalho e gera erros), vamos usar os loops aninhados. Isso é o que
realmente torna você um Desenvolvedor Java.

Estude como os dois for trabalham juntos:

 */

public class Loops{
    public static void main (String[] args ){

        int[][] tabuleiro = new int[3][3];

//Usando loops para preencher e imprimir ao mesmo tempo
        for (int i = 0; i < 3; i++) { // Linhas
            for (int j = 0; j < 3;j++) { //colunas

// Lógica da Diagonal: se a linha for igual a coluna, coloque 1
                if (i == j) {
                    tabuleiro[i][j] = 1;
                } else {
                    tabuleiro[i][j] = 0;

// Imprime o valor atual (print sem 'ln' para ficar na mesma linha)
                    System.out.print(tabuleiro[i][j] + " ");
                }
// Pula para a próxima linha do console após terminar as colunas
                System.out.println();
            }
            System.out.println(" Valor no centro (1,1): " + tabuleiro[1][1]);

        }
    }
}

 /*

    Por que isso é incrível ?
. Poder de Escala: Se você mudar o tamanho para [100][100], esse
mesmo código preenche 10.000 casas milissegundos.
. Lógica Pura: O if (i == j) idenfica automaticamentea diagonal
(0,0 1,1 2,2).

   ALGUMAS INFORMAÇÕES QUE PRECISAM SER ESCLARECIDAS POR VIA DAS DUVIDAS.



  O for faz o trabalho pesado de percorrer as casas, mas você ainda
precisa dizer a regra do jogo dentro dele.
Para visualizar melhor, pense na diferença entre o trabalho manual
e o automatizado:

            1- Sem o for (Manual)
  Você é o pedreiro que precisa carregar tijolo por tijolo e colocar
exatamente na coordenada certa. Se a parede tiver 100 tijolos, você
terá 100 linhas de código. É o que você estava fazendo antes:
. tabuleiro[0][0] = 1;
. tabuleiro[0][1] = 0;... (e assim por diante).

            2- Com o for (Automação)
O for é como uma máquina de assentar tijolos. Ela passa por todas
as posições da parede sozinha. Porém, a máquina não sabe se você
quer um tijolo vermelho ou um cinza.
 É aí que entra a sua condição (IF):

. O for garante que você vai visitar cada "gaveta" fa matriz
. O if dentro do loop decide o que colocar em cada gaveta enquanto
a máquina passa por ela.

"EU preciso fazer toda a condição?"

  Não. Você não precisa fazer uma condição para a posição 0,0, ou outra
para 0,1, etc. Você cria uma regra geral.

  No exemplo da diagonal, a regra geral é: "Se o número da linha for igual
ao dqa coluna, coloque 1. se não, coloque 0".



      if (i == j) { // Essa única linha de regra geral...
   tabuleiro[i][j] = 1;

    } else {      // ...resolve todas as 9, 100 ou 1 milhão de casas da matriz.

   tabuleiro[i][j] = 0;
    }

  Resumo:

. O for aninhado: Resolve o problema de "onde" (ele passa por todos os endereços)
. A condição (if): Resolve o problema de "o quê" (ela decide o valor
baseado na regra que você criou).

  Ficou mais claro ? Imagine que agora, se eu te pedisse para fazer
uma matriz de 1000x1000 onde apenas a primeira coluna fosse o número 7,
você só precisaria mudar o if para if(j == 0) e o for faria o resto em um piscar de olhos.


*/



