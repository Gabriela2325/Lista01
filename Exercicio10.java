public class Exercicio10 {
    public static void executar(){

        System.out.println("Exercicio10");

        //10. Escreva um algoritmo que leia um número de 1 a 5 e escreva-o por extenso.
        // Casoo usuário digite um valor que não esteja neste intervalo, exibir a mensagem:
        // “Númeroinválido!”

        int num = Prompt.lerInteiro("Digite um número de 1 a 5:");

        switch (num) {
            case 1:

            System.out.println("Número UM");
                
                break;

            case 2:

                System.out.println("Número DOIS");
                    
                break;

            case 3:

                System.out.println("Número TRÊS");
                    
                break;

            case 4:

                System.out.println("Número QUATRO");
                    
                break;

            case 5:

                System.out.println("Número CINCO");
                    
                break;
        
            default:

            System.out.println("Númeroinválido!");

                break;
        }

    }
}
