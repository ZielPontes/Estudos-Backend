/* Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. */

package condicionaisIfElse;

import java.util.Scanner;

public class ex01 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        IO.print("Por favor, informe um número inteiro ou negativo: ");
        int number = sc.nextInt();

        if (number < 0){
            IO.println( number + " é negativo.");
        }
        else{
            IO.println(number + " é positivo");
        }

        sc.close();
    }
}
