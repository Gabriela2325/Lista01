public class Exercicio08 {
    public static void executar(){

        System.out.println("Exercicio08");

        //8. Escreva um algoritmo que leia um número e mostre uma mensagem caso
        // este número seja maior ou igual a 50, outra se ele for menor que 50

        int num = Prompt.lerInteiro("Informe o número: ");

        if(num >= 50){

            System.out.println("O número é maior ou igual a 50");

        }else {

            System.out.println("O número é menor que 50");

        }

    }
}
