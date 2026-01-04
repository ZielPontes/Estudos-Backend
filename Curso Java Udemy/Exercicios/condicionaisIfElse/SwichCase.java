package condicionaisIfElse;

import java.util.Scanner;

public class SwichCase {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int x = sc.nextInt();
        String dia;

        switch (x){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = ("Valor inválido!");
                break;
        }
        System.out.println("O dia da semana é  " + dia);
        sc.close();
    }

}

/* Novo método para usar o switch-case após o java 14.

public class SwichCase {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int x = sc.nextInt();

        // O switch agora "devolve" o valor diretamente para a variável
        String dia = switch (x) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado";
            default -> "Valor inválido!";
        }; // Note que aqui precisa de ponto e vírgula porque é uma atribuição

        System.out.println("O dia da semana é " + dia);
        sc.close();
    }
}*/