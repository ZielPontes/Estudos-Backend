package For;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

       

        for (int i=1 ; i<=n; i++){
            int quadrado = (int)Math.pow(i,2);
            int cubo = (int)Math.powExact(i, 3);
            System.out.println(i +" "+ quadrado +" "+ cubo);
        }
        
        sc.close();
    }
    
}
