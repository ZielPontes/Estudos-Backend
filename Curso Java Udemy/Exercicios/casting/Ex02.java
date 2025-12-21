package casting;

import java.util.Locale;

public class Ex02 {
    public static void main(String[] args) {
        // Variaveis númericas do tipo float.
        float a = 6f;
        float b = 8f;
        float c = 5f;

        float area = (a + b) / 2 * c;



        System.out.printf(Locale.US,"A área do objeto é: %.1f%n", area);
    }
}
