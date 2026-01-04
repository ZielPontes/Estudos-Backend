/* Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. */

package condicionaisIfElse;

import java.util.Scanner;

public class ex02 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.print("Digite um número para saber se ele é primo ou inteiro ==> " );
        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println(number + " é um número primo");
        }
        else {
            System.out.println( number + "não é um número primo");
        }

        sc.close();
    }
}
