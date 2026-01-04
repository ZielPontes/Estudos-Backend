/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/

package While;

import java.util.Scanner;

public class whileex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Cadastre seu usuário: ");
        String user = sc.nextLine();

        System.out.print("Cadastre sua senha: ");
        String password = sc.nextLine();
        

        System.out.println("======= LOGIN ======= ");
        System.out.print("Usuário: ");
        String logUser = sc.nextLine();

        System.out.print("Senha: ");
        String logPassword = sc.nextLine();

        

        while (!logUser.equals(user) || !logPassword.equals(password)){ // Se lê: Enquanto logUser não for igual à User ou ... a condição vira verdadeira e o loop acontece.
            System.out.println("\n---------------------------");
            System.out.println("Usuário ou Senha inválidos!");
            System.out.println("Por favor, tente novamente.");
            System.out.println("---------------------------\n");
            System.out.println("======= LOGIN =======");
            
            System.out.print("Usuário: ");
            logUser = sc.nextLine();
            
            System.out.print("Senha: ");
            logPassword = sc.nextLine();
        }
        System.out.println("\n**********************");
        System.out.println("Bem vindo "+ user +" !");
        System.out.println("**********************");

        sc.close();
    }
}

