/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.*/

package condicionaisIfElse;

import java.util.Locale;
import java.util.Scanner;

public class ex07 {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("       Y");
        System.out.println("    Q2 Î Q1");
        System.out.println("   <--------> X");
        System.out.println("    Q3 | Q4");
        System.out.println("       v   ");
        System.out.print("Informe o eixo X: ");
        double x = sc.nextDouble();
        System.out.print("Informe o eixo Y: ");
        double y = sc.nextDouble();

        if ( x == 0.0 && y == 0.0){
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo X");
        } else if (y == 0) {
            System.out.println("Eixo Y");
        } else if (x >0.0 && y >=0.0) {
            System.out.println("Q1");
        } else if (x > 0.0 && y < 0.0) {
            System.out.println("Q4");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else {
            System.out.println("Q3");
        }
        sc.close();
    }
}
