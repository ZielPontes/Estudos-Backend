package For;

import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Defina um número para o loop for: ");
        int N = sc.nextInt();

        int soma = 0;
        /*Leitura:
        Para a var I, enquanto ela for menor que N, I irá receber +1. */
        for (int i=0; i< N; i++){ /* <= Enquanto essa condição for verdadeira, o loop irá se repetir. */
            System.out.print("Digite um número ");
            int x = sc.nextInt();

            soma += x;
        }
        System.out.println("Resultado: " + soma);

        sc.close();
    }
    
}
