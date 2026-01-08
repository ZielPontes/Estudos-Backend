package funcoesString;

public class aula {
    public static void main(String[] args) {
        /* Lista de funções para var tipo String.
        
            * Format: toLowerCase(tudo minúsculo), toUpperCase(tudo maiúsculo), trim(remove espaços);
            * Recortar: substring(inicio), substring(inicio, fim);
            * Substituir: Replace(char, char), Replace(string, string);
            * Buscar: IndexOf, LastIndexOf;
            * str.Split("");
        */
        // exemplo:

        String original = "abcde FGHIJ ABC abc DEFG    ";
        // Convertendo para tudo minúsculo:
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'R');
        String s07 = original.replace("abc", "REPLACE");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Original: -"+original+ "-");
        System.out.println("toLowerCase(): -"+s01 + "-");
        System.out.println("toUpperCase(): -"+s02+ " -");
        System.out.println("trim(): -"+s03 +"-"); //Remove os espaços nas extremidades.
        System.out.println("substring(2): -" +s04 +"-");//Recorta caracteres.
        System.out.println("substring(2, 9): -" +s05 +"-");//Recorta caracteres com um ínico e limite.
        System.out.println("replace('a', 'R'): -" +s06 +"-");//Procura um char e troca por outro.
        System.out.println("replace('abc', 'REPLACE'): -" +s07 +"-");//Procura uma string e troca por outra string.
        System.out.println("indexOf: " + i);//Procura a posição inicial da String.
        System.out.println("lastindexOf: " + j);//Procura a última posição da String.

        /* OPERAÇÃO SPLIT */
        String s = "potato apple lemon orange";
        String [] vetor = s.split(" "); // Usando o espaço vazio como separador.
        String word01 = vetor[0];
        String word02 = vetor[1];
        String word03 = vetor[2];

        System.out.println("Original: "+s);
        System.out.println("Vetor: "+vetor[3]);
        System.out.println("Primeira palavra: "+word01);
        System.out.println("Segunda palavra: "+word02);
        System.out.println("Terceira palavra: "+word03);
        
    }
}
