// Scanner é o objeto que é utilizado para criar Inputs.
// Deve se criar uma variavél para armazenar o obj Scanner da seguinte maneira: Scanner sc = new Scanner(system.in) e no final do código adicionar sc.close(). Importante salientar que após o sc.close() o programa não aceitará novas entradas.

package entradas;

import java.util.Locale;
import java.util.Scanner;

public class capturandoEntradas {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); //Atribui o objeto scanner (system.in) à variavel sc. 
        //Pegando palavras.
        System.out.println("Escreva uma palavra: ");
        String x;
        x = sc.nextLine();
        System.out.println("Você digitou: " + x);
        // Capturando tipos Char.
        IO.println("Escreva algo (char): ");
        char b = sc.next().charAt(0); // .charAT indica qual posição da letra vai capturar tendo o 0 como início.
        IO.println("A primeira letra que você digitou é: " + b);
        //Pegando números inteiros.
        int z;
        System.out.println("Escreva  um número inteiro: ");
        z = sc.nextInt();
        System.out.println("Você digitou: " + z);
        // Pegando números reais.
        IO.println("Escreva um número real: ");
        double a = sc.nextDouble();
        IO.println("Você digitou: " + a);
        sc.close(); // Fecha a função Scanner encerrando qualquer entrada de dados.
    }
    
}
