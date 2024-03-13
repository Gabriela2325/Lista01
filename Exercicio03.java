public class Exercicio03 {
    // 3.Escreva um algoritimo que leia dois num inteiros distintos nas variaveis A
    // e B e
    // informe qual deles é maior .
    // Caso os números sejam iguais informar ao usuario que a sequencia de números
    // informados é inválida.

    public static void executar() {

        int A = Prompt.lerInteiro("Digite o primeiro número:");

        int B = Prompt.lerInteiro("Digite o segundo número:");

        if (A > B) {
            System.out.println(" A é Maior que B ");
        } else if (B < A) {
            System.out.println(" B é Maior que A ");
        } else if (A == B) {
            System.out.println(" A sequência de números informados é inválida ");
        }

    }

}
