package casting;

public class Ex03 {
    public static void main(String[] args){
        int a,b;
        double res;
        a = 5;
        b = 2;

        res = (double) a/b; // Casting: Conversão explícita dos valores. Coloquei o tipo double para que o java não Trunc os valores.

        System.out.printf("Números %d e %d foram dividos e convertidos para tipo double. Res: %.2f.%n", a, b, res);

        // Segundo exemplo.

        double c = 5.0;
        int d = (int)c; //Foi necessário adicionar (int) para que o Java realizasse a conversão (casting) de double para int, perdendo as informações após a vírgula.

        System.out.printf("%nO número %.1f do tipo double foi convertido para %d do tipo inteiro.%n", c, d);
    }
}
