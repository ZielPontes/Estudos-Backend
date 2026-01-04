package While;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.println("------- COMBUSTÍVEL -------");
        System.out.println("1 - Álcool.\n2 - Gasolina.\n3 - Diesel\n4 - Sair.");
        System.out.println("---------------------------");
     
        System.out.print("Qual combustível foi abastecido? ");
        int tipo = sc.nextInt();

        int alcool, gasolina, diesel;
        alcool = 0;
        gasolina = 0;
        diesel = 0;

        while (tipo != 4) {
            switch (tipo) {
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel++; /*++ é um incrementador. Ele adiciona +1 a variável sempre que chamado. */
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
                    break;
            }
            System.out.print("Qual combustível foi abastecido? ");
            tipo = sc.nextInt();
        }
        System.out.println("------------------------");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        System.out.println("------------------------");
        System.out.println("    Muito Obrigado !!");

        sc.close();
    }
}
