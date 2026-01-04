/*🚀 Desafio 3: O Conversor de Moedas
Agora é a hora do Desafio 3, o mais completo! Ele vai testar seu switch case e sua habilidade com divisões.

Lembrete do Menu:

Dólar (USD) - Taxa: 5.00

Euro (EUR) - Taxa: 5.50

Libra (GBP) - Taxa: 6.50

Dica extra: Tente usar o Enhanced Switch (aquele com a seta ->) para definir o valor da taxa de conversão baseado na escolha do usuário*/

package OperadorTernario;

import java.util.Scanner;

public class conversorMoedas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("============ Menu ============");
        System.out.println(" 1 - Dólar (USD) - Taxa: 5.00");
        System.out.println(" 2 - Euro  (EUR) - Taxa: 5.80");
        System.out.println(" 3 - Libra (GBP) - Taxa: 6.50");
        System.out.println("==============================");

        System.out.print("Qual moeda deseja converter? ");
        int choose = sc.nextInt();

        System.out.print("Saldo em BRL: R$");
        double carteira = sc.nextDouble();
        double conversao;
        String moeda;

        switch (choose){
            case 1:
                moeda = "Dólar";
                conversao= carteira/5.00;
                break;
            case 2:
                moeda = "Euro";
                conversao = carteira/5.80;
                break;
            case 3:
                moeda = "Libra";
                conversao = carteira/6.50;
                break;
            default:
                moeda = "Nenhuma opção válida.";
                conversao = 0.0;
                break;
        }
        String Resultado = (conversao > 0)
            ? String.format("Seu saldo em %s: %.2f%n", moeda, conversao)
            : "Não foi possível realizar a conversão.";
        System.out.println(Resultado);
        sc.close();
    }
}
