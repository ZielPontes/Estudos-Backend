package doWhile;

import java.util.Locale;
import java.util.Scanner;

public class aula {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char option;
        do{
            System.out.print("Digite a temperatura em Celcius: Cº");
            double celcius = sc.nextDouble();
            double fahrenheit = celcius*1.8 + 32;
            System.out.printf("Convertendo para Farhenheit: Fº%.1f\n", fahrenheit);
            System.out.print("Deseja repetir (s/n)? ");
            option = sc.next().toLowerCase().charAt(0);
            while (option !='s' && option != 'n') {
                System.out.println("Digite apenas [s] ou [n]! ");
                System.out.println("==>: ");
                option = sc.next().toLowerCase().charAt(0);
            }
            
        } while(option == 's');
        System.out.println("Encerrando o programa.");

        sc.close();
    }
    
}
