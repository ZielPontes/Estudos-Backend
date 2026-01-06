package For;

import java.util.Locale;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para o loop: ");
        int n = sc.nextInt();

        for(int i=0; i<n;i++){
            System.out.println("Digite 2 números:");
            System.out.print("=> ");
            int n1 = sc.nextInt();
            System.out.print("=> ");
            int n2 = sc.nextInt();

            if(n2 == 0){
                System.out.println("Divisão impossível");
            } else{
                double res = (double) n1/n2;
                System.out.println(res);
            }
        }

        sc.close();
    }
    
}
