package For;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor inteiro para repetição: ");
        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i<n; i++ ){
            System.out.print("Digite um número inteiro: ");
            int x = sc.nextInt();

            if (x >= 10 && x <= 20) {
                in +=1;
            } else {
                out ++;
            }
        }
        System.out.println("In: "+in);
        System.out.println("Out: " + out);
        sc.close();
    }
}
