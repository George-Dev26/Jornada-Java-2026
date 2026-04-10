package FundamentosELogica;
  /* Variável é uma etiqueta que você coloca em uma dessas gavetas.

Nome: A etiqueta (ex:idade), Tipo: O tamanho da gaveta (ex: int), Valor: O que tem dentro da gaveta (ex:25).

 O Java é fortemente TIPADO.

Tipos Primitivos: INT, BOOLEAN, DOUBLE, STRING, BYTE, SHORT, LONG E FLOAT. */



//                              EXEMPLO COMPLETO

/*

public class ConceitoVariavel {
    public static void main (String [] args){

//          Declaração e Inicialização

    int idade = 30;
    double altura = 1.75;
    boolean estudaJava = true;
    char inicial = 'G';         // String: Usa aspas duplas " " e guarda textos.  Char: Usa aspas simples ' ' e guarda apenas UM caractere.


//              Exibiondo os valores


        System.out.println(" IDADE: " + idade);
        System.out.println(" DOUBLE: " + altura);
        System.out.println(" ESTUDA JAVA ? " + estudaJava);
        System.out.println(" INICIAL ? " + inicial );

    }
}

*/




//                              EXERCÍCIO PRÁTICO


public class ConceitoVariavel{    // Vou colocar a class pelo mesmo nome mas finja que a classe é DADOSPESSOAIS, apenas para eu não ter que criar uma nova CLASSE
    public static void main (String [] args){

        int idade = 20;
        double altura = 2.00;
        boolean empregado = true;
        String nome = "Guts";


        System.out.println("Qual é a sua Idade? " + idade);
        System.out.println("Quanto de altura você tem? " + altura);
        System.out.println("Você no momento presente está empregado(a)? " + empregado);
        System.out.println("Qual é seu nome? " + nome);

    }
}

//                            FIMM




