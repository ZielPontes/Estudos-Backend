package meusExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
        int A, B, C, D;
        IO.print("Primeiro número: ");
        A = sc.nextInt();
        IO.print("Segundo número: ");
        B = sc.nextInt();
        IO.print("Terceiro número: ");
        C = sc.nextInt();
        IO.print("Quarto número: ");
        D = sc.nextInt();

        int diferenca = (A * B - C * D);

        System.out.printf("Diferença: %d%n", diferenca);
        sc.close();
    }
}
