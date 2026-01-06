package meusExercicios;

import java.util.Locale;
import java.util.Scanner;

public class validadorNotas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("= = = = MÉDIA DE NOTAS = = = =");
        System.out.println("Digite [1] para calcular média.\nDigite [2] para fechar o programa.");
        System.out.print("=> ");
        int option = sc.nextInt();

        if(option == 2){
            System.out.println("Encerrando o programa...");
        }

        while (option > 2 || option <= 0) {
            System.out.print("Digite uma opção válida: ");
            option = sc.nextInt();
        }

        while (option == 1) {
            System.out.println("=================");
            System.out.print("1º Nota: ");
            double n1 = sc.nextDouble();
            while (n1 > 10.0 || n1 < 0.0) {
                System.out.println("Nota inválida. Por favor, tente novamente.");
                System.out.print("1º Nota: ");
                n1 = sc.nextDouble();
            }

            System.out.print("2º Nota: ");
            double n2 = sc.nextDouble();

            while (n2 > 10.0 || n2 < 0.0) {
                System.out.println("Nota inválida. Por favor, tente novamente.");
                System.out.print("2º Nota: ");
                n2 = sc.nextDouble();
            }
            double media = (n1 + n2) /2;
            System.out.println("=================");
            System.out.printf("Média: %.2f\n", media);
            if (media > 3){
                System.out.println("Aprovado!");
            } else{
                System.out.println("Reprovado!");
            }

            System.out.println("Deseja adicionar nova nota? [s/n]");
            System.out.print("=> ");
            String resposta = sc.next();

            if (resposta.equalsIgnoreCase("n")){
                System.out.println("Até a próxima!");
                option = 2;
            }
        }
        
        sc.close();
    }
}