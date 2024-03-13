public class Exercicio03 {
    // 3. Escreva um algoritmo que leia dois números inteiros distintos nas variáveis A
    // e B e
    // informe qual deles é maior.
    // Caso os números sejam iguais, informe ao usuário que a sequência de números
    // informados é inválida.

    public static void executar() {

        System.out.println("Exercicio03: ");

        int A = Prompt.lerInteiro("Digite o primeiro número:");
        int B = Prompt.lerInteiro("Digite o segundo número:");

        if (A > B) {
            System.out.println("A é Maior que B");
        } else if (B > A) {
            System.out.println("B é Maior que A");
        } else {
            System.out.println("A sequência de números informados é inválida");
        }

    }
}
