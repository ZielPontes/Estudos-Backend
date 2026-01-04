

package condicionaisIfElse;

import java.util.Locale;
import java.util.Scanner;

public class CalcImposto {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculadora de Imposto ===");
        System.out.print("Informe sua renda: ");
        double renda = sc.nextDouble();
        double faixa1 = 1000 *0.08; // 80,00 do imposto excedente.
        double faixa2 = 1500 * 0.18; // 270,00 do imposto excedente.

        if (renda <= 2000.00){
            System.out.println("Insento de imposto.");
        } else if (renda <= 3000.00){
            renda = (renda - 2000.00) * 0.08;
            System.out.printf("Imposto à pagar: R$%.2f%n", renda);
        } else if (renda <= 4500.00) {
            renda = (renda - 3000.00) * 0.18 + faixa1 ;
            System.out.printf("Imposto à pagar: R$%.2f%n", renda);
        } else {
            renda = (renda - 4500) * 0.28 + faixa1 + faixa2;
            System.out.printf("Imposto à pagar: R$%.2f%n", renda);
        }
        sc.close();
    }
}

// Debug Mental ksks.
// renda = 3002                         renda2 = 4500
// 1000 * 8/100 = 80                    80,00 (8% de 1000.00)
// renda = renda - 3000.00              270,00 (18% de 1500.00)
// renda = 2,00 * 18/100 = 0,36         renda2 = o que exceder de 4500* 28/100 + 270+80
// renda = 0,36 + 80,00 = 80,36