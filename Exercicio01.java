public class Exercicio01 {
    public static void executar() {

        System.out.println("Exercicio01: ");

        // 1.Escreva um algoritmo que leia um número digitado pelo usuário e mostre
        // amensagem
        // “Número maior do que 10!”, caso este número seja maior,
        // ou “Númeromenor ou igual a 10!”, caso este número seja menor ou igual.

        int num = Prompt.lerInteiro("Digite o número:");

        if (num > 10) {
            System.out.println("Número maior do que 10!");
        } else {
            System.out.println("Número menor ou igual a 10!");
        }

    }

}
