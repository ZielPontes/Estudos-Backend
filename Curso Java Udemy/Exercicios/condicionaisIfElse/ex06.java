/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/

package condicionaisIfElse;

import java.util.Locale;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para saber se ele está nos intervalos ([0,25], (25,50], (50,75], (75,100]).");
        System.out.print("==> ");
        double num = sc.nextDouble();
        if (num >= 0 && num <= 25){
            System.out.println(num + " Está no intervalo entre 0 e 25");
        } else if (num > 25 && num <= 50) {
            System.out.println(num + " Está no intervalo entre 25 e 50");
        } else if (num > 50 && num <= 75 ) {
            System.out.println(num + " Está no intervalo entre 50 e 75");
        } else if (num > 75 && num <= 100) {
            System.out.println(num + " Está no intervalo entre 75 e 100");
        } else {
            System.out.println("Número fora do intervalo.");
        }

        /*Versão corrigida do professor:
        * if (num < 0 || num > 0){  // Aqui o professor está verificando se num é menor
        *                              que 0 ou maior que 100, caso seja verdadeiro ira
        *                              mostra a mensagem fora de intevalo, do contrario
        *                              ele só verifica se o numero é menor ou igual a
        *                              cada condição. //
        *   System.out.println("Fora de intervalo");
        *} else if (num <=25){
        *    System.out.println("Intervalo: [0,25]")}
        * } else if (num <=50){ // Se passar de 25 o programa já entende e vai direto para o outro else.
         *  System.out.println("Intervalo: [25,50]")}*/

        sc.close();
    }
}
