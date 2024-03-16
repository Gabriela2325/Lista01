public class Exercicio17 {
    public static void executar(){

        System.out.println("Exercicio17");

        //17. Elabore um algoritmo que receba três notas de um aluno os pesos referentes acada nota e
        // retorne a sua média ponderada. Veja o cálculo da média ponderada:
        //Média ponderada = nota1 * peso1 + nota2 * peso2 + nota3 * peso3peso1 + peso2 + peso3
        //Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8, peso1 = 5, peso2 = 3, peso3 = 2Média ponderada = 8.25

        double nota1 = 10 ;
        double nota2 = 5.5;
        double nota3 = 8 ;

        int peso1 = 5;
        int peso2 = 3;
        int peso3 = 2;

        System.out.println("A média ponderada do aluno é: " + ((nota1 * peso1) + (nota2* peso2) + (nota3 * peso3))/ (peso1 + peso2 + peso3));
    }
}
