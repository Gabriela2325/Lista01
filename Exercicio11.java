import java.util.Arrays;

public class Exercicio11 {
    public static void executar(){

        System.out.println("Exercicio11");

        //11. Escreva um algoritmo que leia três valores inteiros distintos e escreva-os emordem crescente.

        int A = Prompt.lerInteiro("Digite o 1° valor");

        int B = Prompt.lerInteiro("Digite o 2° valor");

        int C = Prompt.lerInteiro("Digite o 3° valor");

        int[] numeros = {A, B, C};

        Arrays.sort(numeros);

        System.out.println("Os números em ordem crescente são:");
        
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}