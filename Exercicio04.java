public class Exercicio04 {
    // Escreva um algoritmo que leia dois numeros e ao final mostre sua soma,
    // subtração, multiplicação e divisão
    // dos búmeros lidos

    public static void executar() {

        double num1 = Prompt.lerDecimal("Digite o 1° número:");

        double num2 = Prompt.lerDecimal("Digite o 2° número:");

        System.out.println(" A Soma dos dois números é : " + (num1 + num2));

        System.out.println(" A Subtração dos dois números é : " + (num1 - num2));

        System.out.println(" A Multiplicação dos dois números é : " + (num1 * num2));

        System.out.println(" A Divisão dos dois números é : " + (num1 / num2));

    }

}
