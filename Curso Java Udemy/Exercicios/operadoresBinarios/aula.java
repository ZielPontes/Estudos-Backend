package operadoresBinarios;

import java.util.Scanner;

public class aula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* *Operadores Binários*

            Operadores binários são comparadores que verificam cada bit e retorna o valor de True ou False.
           & (Operador E)- F F = F | V F = F | F V = F | V V = V.
             (Retorna verdadeiro somente se AMBAS condições forem VERDADEIRAS)

           | (Operador Ou)- F F = F | F V = V | V F = V | V V = V.
             (Retorna verdadeiro se uma das condições ou ambas forem Verdadeiras.)

           ^ (Operador Ou-Exclusivo)- Tabela verdade: F F = F | V V = F | F V = V | V F = V
             (somente retornará verdadeiro se um for falso e outro verdadeiro.)
        
        */
        
        int mask = 0b00100000; // atribuindo um número binário à variável equivalente a nº32.
        int n = sc.nextInt();

        if ((n & mask) != 0){
            System.out.println("O sexto bit é Verdadeiro.");
        }else {
            System.out.println("O sexto bit é Falso.");
        }
        sc.close();
    }
}
