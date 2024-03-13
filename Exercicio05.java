public class Exercicio05 {
    public static void executar() {

        System.out.println("Exercicio05: ");

        //5. Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valorda variável 
        //A passe a ser o valor da variável B e o valor da variável B passe a ser o valor da variável A.
        //Apresentar uma mensagem com o valor original de cada variávele outra com os valores trocados.

        int A = Prompt.lerInteiro("Digite o valor de A:");

        int B = Prompt.lerInteiro("Digite o valor de B:");

        System.out.println("Valore de A antes da troca:" + A);
        System.out.println("Valore de B antes da troca:" + B);

        int aux = A;
        A = B;
        B = aux;

        System.out.println("Valor de A depois da troca:" + A);
        System.out.println("Valor de B depois da troca:" + B);


    }
}
