/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente*/

package condicionaisIfElse;

import java.util.Scanner;

public class ex03 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite número A: ");
        int A = sc.nextInt();

        System.out.print("Digite número B: ");
        int B = sc.nextInt();

        if (A % B == 0 || B % A ==0){
            System.out.println("São Multiplos.");
        }
        else {
            System.out.println("Não são Multiplos.");
        }


        sc.close();
    }
}
