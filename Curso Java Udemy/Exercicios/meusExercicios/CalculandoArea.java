/*🏋️ Exercício 03: Cálculo de Área e PerímetroCrie um programa que leia a base e a altura de um retângulo. O programa deve calcular e exibir:A área ($base \times altura$).O perímetro ($2 \times (base + altura)$).Desafio Extra: Tente exibir os resultados usando tanto a concatenação com + quanto o printf com os especificadores %f e %d.*/
package meusExercicios;

import java.util.Locale;
import java.util.Scanner;

public class CalculandoArea{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Calculando Perimetro --------");
        //Largura
        IO.println("Informe a largura: ");
        double largura = sc.nextDouble();
        //Altura
        IO.println("Informe a altura: ");
        double altura = sc.nextDouble();
        //double area = largura*altura;
        double perimetro = 2* (largura + altura);

        System.out.printf("Sua área total é de: %.2f%n", (largura*altura));
        //System.out.println("Sua área total é de " + area);
        System.out.printf("Seu perímetro é de: %.2f%n", perimetro);

        sc.close();
    }

}