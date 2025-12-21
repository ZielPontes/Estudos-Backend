/*Esse é um programa que vai pegar as medidas de um espaço que seja quadrado ou retângulo e preço por m²
e irá retornar a área total com o valor final do terreno. */

package meusExercicios;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraTerreno {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        IO.println("----- Calculadora de Terreno -----");
        System.out.printf("------------------------------%n");

        //Capturando dados do cliente.
        IO.println("Insira a altura do terreno: ");
        double A = sc.nextDouble();
        IO.println("Insira a largura do terreno: ");
        double B = sc.nextDouble();
        IO.println("Valor do metro²: ");
        double C = sc.nextDouble();
        System.out.printf("------------------------------%n");

        double area = B*A;
        double preco = C * area;
        System.out.printf("Altura: %.1f%nLargura: %.1f%nPreço(m²): %.2f%nÁrea: %.2fm²%n", A, B, C, area);
        System.out.printf("Preço do Terreno: %.2f%n", preco);
        if (area > 100.0){
            System.out.println("Status: Terreno de Grande Porte.");
        }
        else {
            IO.println("Status: Terreno padrão.");
        }

        System.out.printf("------------------------------%n");


        sc.close();
    }
}
