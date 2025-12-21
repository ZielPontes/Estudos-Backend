package entradas;

import java.util.Locale;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){
        // Crie um programa que leia 3 números digitados sendo cada um de um tipo (String, Int, Double) e exiba na tela.

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        String var0 = sc.next();

        int var1;
        System.out.println("Escreva um número: ");
        var1 = sc.nextInt();

        double var2;
        System.out.println("Escreva um número real: ");
        var2 = sc.nextDouble();

        System.out.printf("Você escreveu: %s.%nDigitou: %d.%nInformou: %.2f.%n", var0, var1, var2);



        sc.close();
    }
}
