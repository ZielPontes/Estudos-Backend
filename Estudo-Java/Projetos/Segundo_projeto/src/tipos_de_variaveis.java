package Projetos.Segundo_projeto.src;

import java.util.Locale;

public class tipos_de_variaveis {
    public static void main(String[] args) {
        byte num0 = 10; // 8 bits
        short num1 = 500; // 16bits
        int num2 = 900000000; // 32 bits
        long num3 = 900000000L; // 64 bits (adicionado L para long)

        double num4 = 5.102614;

        char letra = 'a'; // Para char é necessário usar aspas simples, enquanto Strings necessitam de
                          // aspas duplas "".
        String palavra = "Jesus";
        System.out.println("byte: " + num0);
        System.out.println("short: " + num1);
        System.out.println("int: " + num2);
        System.out.println("long: " + num3);
        System.out.println(letra);
        System.out.println("String: " + palavra);
        System.out.println(num4);
        System.out.printf("%.3f%n", num4);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f\n", num4);
    }
}