public class Exercicio02 {
    // 2. Escreva um algoritmo que leia dois números digitados pelo usuário
    // e exiba oresultado da sua soma

    public static void executar() {

        System.out.println("Exercicio02: ");

        int num1 = Prompt.lerInteiro("Digite o primeiro número:");

        int num2 = Prompt.lerInteiro("Digite o segundo número:");

        System.out.println("A soma é :" + (num1 + num2));

    }

}
