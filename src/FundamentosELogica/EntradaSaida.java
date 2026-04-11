package FundamentosELogica;

//                      CONTEUDO DO ASSUNTO SCANNER

/* COISAS IMPORTANTES DO SCANNER:
1- IMPORTAR A FERRAMENTA: import java.util.Scanner; (FICA NO TOPO).
2- CIRAR O OBJETO SCANNER: Scanner leitor =  new Scanner (System.in);
3- LER OS DADOS: leitor.nextLine() -> PARA TEXTOS (STRING).
    . leitor.mextInt() -> PARA NÚMEROS INTEIROS
    . leitor.nextDouble() -> PARA DECIMAIS.

 */


/*


//                                  EXEMPLO COMPLETO


import java.util.Scanner; // O que é: O java é organizado em "pacotes", ele só carrega o básico. O Scanner não está no básico, ele mora no pacote util.
// Porque importa: Sem essa linha, o Java não sabe o que é um "Scanner". É como importar uma ferramenta de uma caixa de ferramentas externa.



public class EntradaSaida {
    public static void main(String[] args){
// Instanciar o Scanner
    Scanner sc = new Scanner(System.in); // Scanner sc: Você está criando uma variável do tipo Scanner chamado sc(pode ser qualquer nome, como leitor ou teclado)
// New Scanner: O new cria o objeto na memória.
// System.in: Avisa ao Java que esse Scanner deve olhar para a entrada do sistema (o seu teclado)


// Pedir o dado ao usuário
    System.out.print("Digite seu nome: ");
    String nome = sc.nextLine(); // sc.nectLine(): O programa para aqui e fica esperando você digitar algo e apertar Enter. Ele lê a linha inteira (incluindo espaçoes).


    System.out.print("Digite sua idade: ");
    int idade = sc.nextInt(); // sc.nextInt(): Mesma coisa, mas ele espera um número inteiro. Se você digitar uma letra aqui, o programa vai dar erro(Exception).



// Exibir o resultado (Saída de Dados)
    System.out.println(" Olá " + nome + ", você tem " + idade + "anos! ");

// Fecha o Scanner
        sc.close(); // Por que fechar? O Scanner abre um "canal de comunicação" com o sistema operacional. Fechar o Scanner é uma boa prática para liberar memória e recurso do pc assim que você terminar de usar o teclado.

    }
}

*/

//                                              EXERCÍCIO PRÁTICO
import java.util.Scanner;
import java.util.Locale; // Importação necessária para o ponto decimal

public class EntradaSaida{
    public static void main (String [] args){

    Scanner compra = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Digite o nome do filme: ");
    String filme = compra.nextLine();

    System.out.print("Digite o horário da sessão: ");
    Double horario = compra.nextDouble();

    System.out.print("Número da sala por favor: ");
    int sala = compra.nextInt();

    System.out.print("O valor do ingresso: ");
    Double valor = compra.nextDouble();

    System.out.print("É Meia Entrada: ");
    Boolean meia = compra.nextBoolean();


//          EXIBIÇÃO DOS DADOS

    System.out.println(" ======  INGRESSO GERADO ======");
    System.out.println("Filme: " + filme);
    System.out.println("Horário: " + horario);
    System.out.println("Sala: " + sala);
    System.out.println("Valor: " + valor);
    System.out.println("É meia entrada: " + (meia ? "Sim" : "Não"));
    System.out.println("=========================");

    compra.close();

    }
}


//                          FIMM






















