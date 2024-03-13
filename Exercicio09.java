public class Exercicio09 {
    public static void executar(){
        System.out.println("Exercicio09");

        //9. Leia dois números nas variáveis A e B e identifique se os valores são iguais oudiferentes. 
        //Caso eles sejam iguais imprima uma mensagem dizendo que são iguais.
        //Caso sejam diferentes, informe que são diferentes e qual número é o maior

        int A = Prompt.lerInteiro("Digite o valor de A:");

        int B = Prompt.lerInteiro("Digite o valor de B:");

        if(A == B){

            System.out.println("A e B são iguais");

        }else{

            System.out.println("A e B são diferentes");

            if(A > B){

                System.out.println("A é MAIOR que B ");

            }else if(A < B){

                System.out.println("B é MAIOR que A");

            }
        }
    }
}
