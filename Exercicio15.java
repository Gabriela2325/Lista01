public class Exercicio15 {
    public static void executar(){

        System.out.println("Exercicio15");

        //15. Tendo como dados de entrada dois pontos quaisquer no plano, P1(x1, y1) e P2(x2,y2),
        //calcule e retorne a distância entre eles. A fórmula que efetua tal cálculo é:
        // d = raiz(((x2 - x1)2) + ((y2 - y1)2)). Exemplo: p1(0, 5), p2(10, 20). Distancia: 18,03

        
        int x1 = 0 ;
        int x2 = 5 ;

        int y1 = 10 ;
        int y2 = 20 ;

        double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("A distância entre os pontos é: " + d);
    }
}