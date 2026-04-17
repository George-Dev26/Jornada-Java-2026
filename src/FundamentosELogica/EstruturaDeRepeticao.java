package FundamentosELogica;
/*
//				    Estrutura de Repetição (Loops).

O que são Lopes?
 Imagine que você precisa imprimir "Bom dia" 100 vezes. Em vez
de escrever 100 linhas de System.out.println, você usa Loop que
diz ao Java: "Repita este bloco de código 100 vezes".

 As duas estruturas que mais vamos usar são o while e o for.


1- A Estrutura While (Enquanto)
 O while é usado quando você não sabe exatamente quantas vezes
algo vai se repetir, apenas que deve continuar enquanto uma
condição for verdadeira.

Exemplo mental: "Equanto o tanque de combustível não estiver
cheio, continue abastecendo."



// 			            ESTRUTURA DE CÓDIGO:


public class ExemploWhile {
    public static void main (String[] args) {
        int contador = 1;

        while (contador <= 5) {
            System.out.printpl("Repetição número: " + contador);
            contador++; // Isso é Vital! Incrementa o valor para o loop não ser infinito.

}
}
}
*/



/*

2- A Estrutura for (Para)
 O for é usado quando você sabe exatamente o limite da repetição.
Ele é mais compacto porque coloca a criação da variável, a condição
e o incremento tudo na mesma linha.

Exemplo mental: "Para cada degrau de 1 a 10, suba um passo."




//			ESTRUTURA EM CÓDIGO

public class exemploFor {
    public static void main (String [] args){

//(ponto de partida ; condição ; incremento)
        for (int i = 1; i <= 5; i++) {
            System.out.println("Contagem: " + i);
  }
 }
}

*/




//                          EXERCÍCIO PRÁTICO

import java.util.Scanner;

public class EstruturaDeRepeticao {
    public static void main (String[] args){

    Scanner leitor = new Scanner(System.in);

   System.out.print(" Digite um número que deseja ver na Tabuada:");
   int tabuada = leitor.nextInt();

   System.out.println("=== Tabuada do " + tabuada + " ===");

   // O FOR ( Início ; Condição ; Incremento )

   for (int i = 1; i <= 10; i++) {
   int resultado = tabuada * i;

       System.out.println( tabuada + " x " + i + " = " + resultado);

   }
   leitor.close();

    }
}

/*
 O que acontece dentro do LOOP:
Agora, o que o programa faz toda vez que ele der uma volta:

. O Cálculo: Ele pega o número que o usúario digitou e multiplica pelo valor atual da
contagem (na primeira volta é 1, na segunda é 2...).
. A Exibição: Ele mmostra na tela o resultado formatado (ex: "7 x 1 = 7").

   A Finalização
. O motor para sozinho assim que a contagem passar de 10.
. Você encerra o escutador do teclado para liberar memória.
 */





























