package FundamentosELogica;
/*
                                        Matrizes

Se o Array (Vetor) que acabamos de estudar é uma linha de gavetas, a Matriz é um armário
inteiro com várias linhas e várias colunas. Imagine uma planilha do Excel ou um tabuleiro
de xadrez; isso é uma Matriz.

Entender matrizes é fundamental para lidar com tabelas de dados, cordenadas e estruturas
 mais complexas de sistemas.

 O QUE É UMA MATRIZ ?
Uma Matriz é um Array de Arrays.
. No Vetor, você usava um índice: valor[0].
. Na Matriz, você usa dois: o primeiro para a Linhda e o segundo para a Coluna matriz[linha][coluna].

Sintaxe no Java
Para declarar uma matriz de números inteiros com 3 linha e 3 colunas:

int[][] tabela = new int[3][3];

Para colocar um valor na primeira linha e primeira coluna:

tabela[0][0] = 10;



Exercício de Aquecimento (Estrutura de Código)
Vamos cirar uma matriz que represente uma pequena tabela de notas de alunos. Cada linha
será um aluno e cada coluna uma nota.




public class Matrizes {
 public static void main (String[] args ) {
// Criando uma matriz de 2 linhas e 2 colunas
 double[][] notas = new double[2][2];

// Aluno 0
notas[0][0] = 8.5; // Nota 1 do Aluno 0
notas[0][1] = 7.0; // Nota 2 do Aluno 0

// Aluno 1

notas[1][0] = 9.0; // Nota 1 do Aluno 1
notas[1][1] = 10.0; // Nota 2 do Aluno 1

// Acessando a nota 2 do Aluno 1
  System.out.println("A segunda nota do segundo aluno é: " + notas[1][1]);
}
}


 */


/*
                        DESAFIO
Viu como se atribui valores. Tente fazer o seguinte:

1- Crie uma matriz de inteiros chamada tabuleiro com tamanho 3x3.
2- Preencha as posições da diagonal principal(onde linha e coluna são iguais : [0][0], [1][1],[2][2] com o número 1.
3- Preencha o restante com número 0.
4- Imprima o valor que está exatamente no centro do tabuleiro (linha 1, coluna 1).

 */

public class Matrizes{
    public static void main (String [] args ){

      int [][] tabuleiro = new int[3][3];

      tabuleiro[0][0] = 1;
      tabuleiro[1][1] = 1;
      tabuleiro[2][2] = 1;

      tabuleiro[1][0] = 0;
      tabuleiro[2][0] = 0;
      tabuleiro[0][0] = 0;

      tabuleiro[1][2] = 0;
      tabuleiro[2][2] = 0;
      tabuleiro[1][0] = 0;


      System.out.println("O valor no centro do tabuleiro (1,1) é: " + tabuleiro[1][1]);
    }
}

























