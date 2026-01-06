package For;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número para ver seus ímpares: ");
        int x = sc.nextInt();

        for (int i = 1; i <= x ; i+=2){
            System.out.println(i);
        }
        sc.close();
    }
    
}
