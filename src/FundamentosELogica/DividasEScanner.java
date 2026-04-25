package FundamentosELogica;

//                          EXERCÍCIO DE VETOR JUNTO COM SCANNER

import java.util.Scanner; // Importação necessária

/*
    Esse Exercicio vai mostra uma forma de validar uma DIVIDA de um individuo
e que ele vai informa até quanto de DIVIDA ele deve nas 5 etapas, como
se ele estivesse devendo a varias pessoas, e no fim de tudo será
somado para determina quanto ele terá no final, essa Estrutura pode ser
utilizada para um calculo de produtos validando cada entrada de produto
ou um sistema complexo.
 */


public class DividasEScanner { // Importação necessária
    public static void main (String[] args ) {

            Scanner leitor = new Scanner(System.in); //Leitor

            int[] valor = new int[5];
            int somaTotal = 0;


            System.out.println("--- Sistema de gestão de dividas ---");

            for (int i =0; i < valor.length; i++) {

                System.out.print(" Digiite o valor da dívida " + (i + 1) + ": ");
                valor [i] = leitor.nextInt(); // O Java para e espera você Usuário digita.


                somaTotal += valor[i]; // Acumulando o valor
            }

            System.out.println("--- Relatório de analise --");

            for (int i = 0; i < valor.length; i++) {
                if (valor[i] > 300) {
                    System.out.println("Alerta: Divida alta detectada: R$ " + valor[i]);
                } else {
                    System.out.println("OK: Divida sob controle: R$ " + valor[i]);
                }
            }

            System.out.println(" Valor total consolidado: R$ " + somaTotal);
            leitor.close(); // sempre fechar o Scanner.

        }
    }



