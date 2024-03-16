public class Exercicio14 {
    public static void executar(){

        System.out.println("Exercicio14");

        //14. A expressão an = a1 + (n – 1) * r é denominada termo geral da ProgressãoAritmética (PA). 
        //Nesta fórmula, temos que an é o termo de ordem n (n-ésimo termo),
        //r é a razão e a1 é o primeiro termo da Progressão Aritmética. 
        //Escreva um algoritmoque encontre o n-ésimo termo de uma progressão aritmética. 
        //Exemplo: a1 = 10, n =7, r = 3. Resultado: an = 28


        int a1 = 10; 
        int n = 7;   
        int r = 3;   

        System.out.println("O " + n + "° termo da progressão aritmética é: " + (a1 + (n - 1) * r));
    }
}



