package OperadorTernario;

import java.util.Scanner;

public class AutoDesconto {
    public static void main(String[] args){
        /*Desafio 2: Calculadora de Desconto (Ternário)
        Um e-commerce quer automatizar descontos. Peça o valor da compra e o tipo de cliente (1 para Comum, 2 para VIP).

        Regras:

        Use o operador ternário para aplicar o desconto no valor final:

        Se for VIP (tipo 2), desconto de 15%.

        Se for Comum (tipo 1), desconto de 5%.

        Exiba o valor final com duas casas decimais.*/
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da compra: ");
        double preco = sc.nextDouble();

        System.out.print("Tipo de cliente (1 - comum|2 - Vip): ");
        int tipo = sc.nextInt();

        if (tipo == 1 || tipo == 2) {
            double desconto = tipo == 1 ? preco * 0.05 : preco * 0.15;
            System.out.printf("Desconto: R$%.2f%n", desconto);
            System.out.printf("Total: R$%.2f%n", preco-desconto);
        } else {
            System.out.println("Tipo de cliente inválido.");
        } sc.close();
    }
}
