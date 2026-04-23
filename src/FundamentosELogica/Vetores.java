package FundamentosELogica;

// 			ARRAYS (Vetores)

/*
Imagine que você precisa guardar os nomes dos lutadores de um
torneio de Muay Thai. Sem Arrays, você criaria lutador1,
lutador2, etc. Com o Arrays, você cria uma única "estante" e
coloca cada lutador numa prateleira numerada.

O que é um Array?
Um Array é uma estrutura de dados que armazena uma coleção de
elementos do mesmo tipo.

        . Tamanho fixo: Uma vez que você define que a estante tem 5
prateleiras, ela terá 5 até o fim.
. Índice (A Chave): No Java, a contagem sempre começa no 0. A
primeira gaveta é a 0, a segunda é a 1, e assim por diante.


Estrutura Base: Array de Strings


 */
/*
public class Vetores {                  //  NOMES DE LUTADORES E SUAS RESPECTIVAS POSIÇÕES
    public static void main (String [] args ) {

//1. Declaração e Instanciação (Criando a "estante" com 3 vagas)
        String[] lutadores = new String[3];

//2. Atribuição (Colocando os nomes nas "gavetas")

        lutadores[0] = "Guts";   // Primeira posição (Índice 0)
        lutadores[1] = "Pippin";     // Segunda posição (Índice 1)
        lutadores[2] = "Casca";  //Terceira posição (Índice 2)

// 3. Acesso (Imprimindo um valor específico)

        System.out.println("O lutador na posição 1 é: " + lutadores[1]);
    }
}

*/


/*
//                              EXERCÍCIO



public class Vetores{        // PONTUAÇÃO DE JOGOS
    public static void main (String [] args ) {

        int[] pontuacoes = new int[5];

        pontuacoes[0] = 10;
        pontuacoes[1] = 20;
        pontuacoes[2] = 30;
        pontuacoes[3] = 40;
        pontuacoes[4] = 50;

        int soma = pontuacoes[0] + pontuacoes[4];

        System.out.println(" As Pontuações de Jogos são: " + soma);

    }
}

O que eu acabei de construir:
Criei uma estrutura de dados estática (o Array) e manipulei valores
específicos através dos Índices. Esse é o fundamento para sistemas que lidam
com listas de preçoes, nomes ou, como o meu exemplo, de pontuações de Jogos.




*/


/*
                    PRÁTICANDO ARRAY


public class Vetores {                  // PARCELAS DE DIVIDA COM LOOP
    public static void main (String [] args ) {

        int[] valor = new int[5];

        valor[0] = 150;
        valor[1] = 250;
        valor[2] = 350;
        valor[3] = 450;
        valor[4] = 550;


        for (int i = 0; i < valor.length; i++) {

            System.out.println("Todas as Parcela a frente" + ": R$" + valor[i]);
        }
    }
}

*/







 public class Vetores {             // CONTINUAÇÃO DE PARCELA DE DIVIDAS SÓ QUE COM LOOP E IF/ELSE
     public static void main(String[] args) {

         int[] valor = new int[5];

         valor[0] = 150;
         valor[1] = 250;
         valor[2] = 350;
         valor[3] = 450;
         valor[4] = 550;

         int somaTotal = 0;

         for (int i = 0; i < valor.length; i++) {

             somaTotal += valor[i];

             if (valor[i] > 300) {
                 System.out.println("Dívida alta encontradas: R$ " + valor[i]);
             } else {
                 System.out.println("Dívida dentro do seu controle: R$ " + valor[i]);
             }

         }
         System.out.println("----------------");

         System.out.println("Valor Total da Dívida: R$ " + somaTotal);

     }
 }

/*

// Por que isso é importante?

  Na Programação, a saída de dados (o que o usuário vê) deve ser limpa, e Mostrar o
cálculo passo a passo é bom para você "debugar" (testar se a conta está certa),
mas para o usuário final, o que importa é o valor consolidado no rodapé.



 */














