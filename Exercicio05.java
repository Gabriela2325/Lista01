import java.util.Scanner;

public class Exercicio05 {
    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Exercicio05: ");

        //5. Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valorda variável 
        //A passe a ser o valor da variável B e o valor da variável B passe a ser o valor da variável A.
        //Apresentar uma mensagem com o valor original de cada variávele outra com os valores trocados.

        System.out.println("Digite o valor de A:");
        int A = leitor.nextInt();
        
        System.out.println("Digite o valor de B:");
        int B = leitor.nextInt();

        System.out.println("Valore de A antes da troca:" + A);
        System.out.println("Valore de B antes da troca:" + B);

        int aux = A;
        A = B;
        B = aux;

        System.out.println("Valor de A depois da troca:" + A);
        System.out.println("Valor de B depois da troca:" + B);

        leitor.close();

    }
}
