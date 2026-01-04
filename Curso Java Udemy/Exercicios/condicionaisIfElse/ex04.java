/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas*/

package condicionaisIfElse;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a hora do ínicio do jogo: ");
        double start = sc.nextDouble();
        System.out.println("Informe a hora de término do jogo: ");
        double finish = sc.nextDouble();

        if ( start < finish){
            double result = finish - start;
            IO.println("O jogo durou " + result + " Horas.");
            }
        else {
            double result = 24 - start + finish;
            IO.println("O jogo durou " + result + " Horas.");
        }


        sc.close();
    }
}
