//🏋️ Exercício 01: O Conversor de Moedas
//Crie um programa que peça ao usuário o valor que ele tem na carteira (em Reais) e a cotação atual do Dólar. O programa deve exibir quanto o usuário tem em dólares.
//Requisitos:
//Use Locale.US para garantir que o usuário digite a cotação com ponto (ex: 5.10).
//Use variáveis do tipo double.
//Exiba o resultado formatado com duas casas decimais usando printf.

package meusExercicios;

import java.util.Locale;
import java.util.Scanner;

public class ConversorDeMoedas {
    public static void main(String[]args){
        System.out.println("------ Conversor de BRL para USR ------");
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.printf("%nInforme seu saldo em R$: ");

        double real = sc.nextDouble();
        double dolar = 5.52;
        double convercao = real / dolar;

        System.out.printf("%n------------------------------------%n");
        System.out.printf("Seu saldo em R$: %.2f%nCotação do Dólar atual é: %.2f%nSeu saldo em Dólar é: %.2f%n", real, dolar, convercao);
        System.out.println("------------------------------------");
        sc.close();
    }
}
