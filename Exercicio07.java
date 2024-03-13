public class Exercicio07 {
    public static void executar(){
        
        System.out.println("Exercicio07");

        //7.Escreva um algoritmo que leia um número e diga, através de uma mensagem,
        //se este número está no intervalo entre 100 e 200. 
        //Caso o número esteja fora do intervaloo usuário também deverá ser informado

        int num = Prompt.lerInteiro("Digite um número:");

        if(100 < num && num < 200){

            System.out.println("O número está dentro do intervalo de 100 a 200");

        }else {

            System.out.println("O número NÃO está dentro do intervalo de 100 a 200");

        }

    }
}
