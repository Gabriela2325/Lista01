public class Exercicio18 {
    public static void executar(){

        System.out.println("Exercicio18");

        //18. Elabore um algoritmo que receba três notas de um aluno e retorne a sua médiaharmônica.
        //Média harmônica =31 + 1 + 1nota1 nota2 nota3
        //Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8Média: 7.37


        double nota1 = 10 ;
        double nota2 = 5.5;
        double nota3 = 8 ;

        System.out.println("A média ponderada do aluno é: " + (3 / ((1 / nota1) + (1 / nota2) + (1 / nota3))));
    }
}
