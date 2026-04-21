package FundamentosELogica;

/*
 			CONTROLE TOTAL SOBRE A EXECUÇÃO

 Às vezes, você não quer que o loop vá até o fim, ou quer que
ele pule uma volta específica. Para isso, usamos dois comandos: break e continue.

1- O Golpe Final: break e continue.
Imagine que o seu loop é uma corrida de 10 voltas:

. break: É como se o corredor abandonasse a pista e parasse a
corrida na hora. O loop acaba imediatamente.
. Continue: É como se o corredor pulasse apenas um obstáculo ou
uma volta específica e continuasse correndo a próxima.

 2- Desafio de Encerramento: "O contador seletivo"
Vamos unir tudo o que você aprendeu no seu projeto do contador
personalizado para fechar a semana.


  O que o código deve fazer:
1- fazer um loop de 1 a 10.
2- Se o número for 5, use o continue (ele vai pular o 5 e não
vai imprimir).
3- Se o número for 9, use o break (ele vai parar o programa
antes de chegar no 10).


*/

//  Como estruturar (Passo a Passo)?:

public class EstruturaContador{
    public static void main (String [] args){

        for (int i = 1; i <= 10; i++) {

            if (i == 5)
                continue;

            if( i == 9)
                break;

            System.out.println(i);

        }
    }
}





