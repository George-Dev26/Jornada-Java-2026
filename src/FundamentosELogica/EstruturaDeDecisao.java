package FundamentosELogica;

/*
        ESTRUTURA DE DECISÃO (IF/ELSE) (SE/SENÃO)

                            CONTEUDO COMPLETO


1- O Java avalia uma condição booleana (algo que só pode ser true ou false).

        if: "Se isso for verdade, faça este bloco de código."


        else if: "Se o primeiro não era verdade, mas esse segundo aqui for, faça este."

        else: "Se nada acima deu certo, façaeste aqui por padrão."



   2- Operadores de comparação: Para criar as condições dentro do if, você vai usar estes sinais:

        ==: igual a
        !=: Diferente de
        >: Maior que
        <: Menor que
        >=: Maior ou igual
        <=: Meno ou igual



   3- Exemplo Prático para análise:

Imagine o seu sistema de cinema. Se o cliente tiver menos de 18 anos, o sistema
avisa que ele precisa de autorização para filmes de ação.



                     Prática de Lógica

public class  EstruturaDeDecisao {


    public static void main (String [] args){

        int idade = 16;

// Estrutura de decisão

        if (idade >= 18){
            System.out.println("Acesso liberado.");
        } else {
            System.out.println("Acesso apenas com autorização dos pais.");
        }
    }
}



O que deve ser observado aqui:

        - As chaves{}: Elas definem o "corpo" da decisão. Tudo o que estiver dentro da
primeira chaves só acontece se a condição for verdadeira. O que estiver dentro
do else só acontece se for falsa.
        - Indentação: Perceba que o código dentro do if e do else está um pouco "para a
direita". Isso é fundamental para o código ficar legível

*/





//                                EXERCÍCIO PRÁTICO

// Juntando o If/Else com o Scanner e pedindo para o usuário a idade em vez de deixar o 16 fixo no código!

import java.util.Scanner;

public class EstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual é a sua Idade? ");
        int idade = leitor.nextInt();


        if (idade>= 60) {
            System.out.println("Acesso prioritário, prossiga senhor!");
        } else if (idade>= 18) {
            System.out.println("Acesso liberado.");
        } else {
            System.out.println("Acesso negado!");
        }
        leitor.close();
    }
}




































