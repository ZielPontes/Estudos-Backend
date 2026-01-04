package condicionaisIfElse;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("          Menu - Restaurante");
        System.out.println("=====================================");
        System.out.println(" Código |  Especificação  | Preço");
        System.out.println("    1   | Cachorro-quente |  R$ 4.00 ");
        System.out.println("    2   |     X-salada    |  R$ 4.50 ");
        System.out.println("    3   |     X-Bacon     |  R$ 5.00 ");
        System.out.println("    4   | Torrada Simples |  R$ 2.00 ");
        System.out.println("    5   |   Refrigerante  |  R$ 1.50 ");
        System.out.println("=====================================");
        System.out.print("Informe o código do produto: ");
        int produto = sc.nextInt();
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        if (produto == 1){
            System.out.printf("Total a pagar: R$%.2f", (double)quantidade*4.00);
        } else if (produto == 2){
            System.out.printf("Total a pagar: R$%.2f", (double)quantidade*4.50);
        } else if (produto == 3){
            System.out.printf("Total a pagar: R$%.2f", (double)quantidade*5);
        } else if (produto == 4){
            System.out.printf("Total a pagar: R$%.2f", (double)quantidade*2);
        }  else if (produto == 5){
            System.out.printf("Total a pagar: R$%.2f", (double)quantidade*1.5);
        } else {
            System.out.println("Código fora do menu. Por favor, selecione um produto existente.");
        }




        sc.close();
    }
}
