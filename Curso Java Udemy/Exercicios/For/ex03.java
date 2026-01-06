package For;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número para o For: ");
        int n = sc.nextInt();

        for(int i=0; i<n;i++){
            System.out.print("Nota 1º Trimestre: ");
            double nota1 = sc.nextDouble();
            System.out.print("Nota 2º Trimestre: ");
            double nota2 = sc.nextDouble();
            System.out.print("Nota 3º Trimestre: ");
            double nota3 = sc.nextDouble();
            
            double media = ((nota1*2.0 + nota2*3.0 + nota3*5.0) /10.0);
            
            System.out.println("\n========= MÉDIA =========");
            System.out.printf("Média: %.1f\n", media);
        }
        sc.close();
    }
}
