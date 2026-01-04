package condicionaisIfElse;

import java.util.Locale;
import java.util.Scanner;

public class ex08 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Operadores de atribuição cumulativa: += -= *= /= %=; Serve para substituir repetição como no exemplo
        // conta += (minutos).... Sem a atribuição seria: conta = conta + (minutos....)

        double conta = 50.00;
        System.out.print("Quantos minutos foram usados? ");
        double minutes = sc.nextDouble();

        if (minutes > 100){
            conta += (minutes - 100)*2.00;
            System.out.printf("Conta: R$%.2f%n", conta);
        } else {
            System.out.printf("Conta : R$%.2f%n", conta);
        }
        sc.close();
    }
}
