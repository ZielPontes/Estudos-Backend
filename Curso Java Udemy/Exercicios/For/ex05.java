package For;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para ver seu fatorial");
        System.out.print("=> ");
        int n = sc.nextInt();
        long fat = 1;
        
        for(int i= 0; i<n; i++){
            fat = fat *(n-i);
        }
        System.out.println(fat);
        sc.close();
    }
}
