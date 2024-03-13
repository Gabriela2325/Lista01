public class Exercicio06 {
    public static void executar(){

        System.out.println("Exercicio06: ");

        //6. Ler uma temperatura em graus Celsius e apresentá-la convertida em grausFahrenheit.
        // A fórmula de conversão é:F = (9 * C + 160) / 5

        double Celsius = Prompt.lerDecimal("Digite a temperatura em Celsius:");

        double Fahrenheit = (9 * Celsius + 160) / 5;

        System.out.println("A temperatura em Fahrenheit é: " + Fahrenheit);

    }

}
