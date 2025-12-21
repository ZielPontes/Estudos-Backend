package FuncoesMatematicas;

import java.util.Locale;

public class FuncMath {
    public static void main (String[] args){
        // Operadores matemáticos.
        /* Algumas funções matemáticas em Java:
        A = math.sqrt(x); Variável A recebe a raíz quadrada de x;
        A = math.pow(x,y); Variável A recebe o resultado de x elevado a y;
        A = math.abs(x); Variável A recebe o valor absoluto de x;
         */
        Locale.setDefault(Locale.US);

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;

        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.printf("Raiz quadrada de %.1f é %f%n",x,A);
        System.out.println("Raiz quadrada de " + y + " é " + B);
        IO.println("Raiz quadrada de 25 é " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);

        IO.println(x + " elevado a " + y + " = " +A);
        IO.println(x + " elevado ao quadrado = " +B);
        IO.println("5 elevado ao quadrado =  " + C);

        A = Math.abs(y);
        B = Math.abs(z);

        IO.println("Valor absoluto de " + y + " = " + A);
        IO.println("Valor absoluto de " + z + " = " + B);
        /* Exemplo: delta = b² - 4ac
        double delta = Math.pow(b, 2.0) - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);*/
    }
}
