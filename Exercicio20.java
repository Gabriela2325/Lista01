public class Exercicio20 {
    public static void executar(){

        System.out.println("Exercicio20");

        //20. Elabore um algoritmo que calcule a quantidade de litros de combustível gasta emuma viagem, 
        //utilizando um automóvel que
        // faz 12km por litro e considerando que sãofornecidos o tempo em hora e a velocidade média da viagem.

        double tempo = Prompt.lerDecimal("Digite o tempo da viagem (em horas): ");

        double velocidadeMedia = Prompt.lerDecimal("Digite a velocidade média da viagem (em km/h): ");

        System.out.println("A quantidade de litros de combustível gasta na viagem é: " + ((tempo * velocidadeMedia) / 12));
        

    }
}
