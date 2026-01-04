package While;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
        /* O programa deve encerrar sem mensagem quando uma das variáveis receber o valor 0. */

        Scanner sc = new Scanner(System.in);
        double x,y;

        System.out.print("Informe o eixo X: ");
        x = sc.nextDouble();
        System.out.print("Informe o eixo Y: ");
        y = sc.nextDouble();

        while (x != 0 && y != 0){
           if (x > 0 && y > 0){
                System.out.println("Primeiro Quadrante.");
                } else if (x > 0 && y < 0) {
                System.out.println("Quarto Quadrante.");            
                } else if (x < 0 && y > 0) {
                System.out.println("Segundo Quadrante.");
                } else if (x < 0 && y < 0) {
                System.out.println("Terceiro Quadrante.");
            }
            System.out.println("\n--------------------");
            System.out.print("Informe o eixo X: ");
            x = sc.nextDouble();
            System.out.print("Informe o eixo Y: ");
            y = sc.nextDouble();
            System.out.println("--------------------");
        }
        sc.close();
    }
}
