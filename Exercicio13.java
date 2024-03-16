public class Exercicio13 {
    public static void executar(){

        System.out.println("Exercicio13");

        //13. Escreva um algoritmo que leia valores REAIS nas variáveis A e B e
        // o tipo deoperador em outra variável do tipo CARACTERE. Imprima o resultado da operaçãode A    
        //por B se o operador aritmético for válido; caso contrário deve ser impresso 
        //umamensagem de operador não definido. Tratar erro de divisão por zero.


        double A = Prompt.lerDecimal("Digite o primeiro valor:");

        double B = Prompt.lerDecimal("Digite o segundo valor:");

        String operador = Prompt.lerLinha("Digite o operador (+, -, *, /):");

        switch (operador) {
            case "+":
                System.out.println("Resultado da adição é: " + (A + B));
                break;

            case "-":
                System.out.println("Resultado da subtração é: " + (A - B));
                break;

            case "*":
                System.out.println("Resultado da Multiplicação é: " + (A * B));
                break;

            case "/":
                 if (B != 0) {
                        System.out.println("Resultado da divisão é: " + (A / B));
                    } else {
                        System.out.println("Erro: divisão por zero!");
                    }
                break;

            default:
                System.out.println("Operador Inválido!!!");
                break;
        }
    }
}
