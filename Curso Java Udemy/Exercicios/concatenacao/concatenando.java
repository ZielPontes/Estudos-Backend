public class concatenando {
    public static void main(String[] args){
        //Exemplo 1 de concatenação:
        double num = 1.55489;

        System.out.println("Percorreu " + num + " Metros.");
        //formatando
        System.out.printf("Percorreu %.2f Km.%n", num);
        // Colocando várias informações concatenadas.

        String nome = "Ziel";
        byte idade = 26;
        double altura = 1.76;
        double peso = 87.650;

        System.out.printf("%s tem %d anos e tem %.2f de altura e pesa %.2f Kg.",nome, idade, altura, peso) ;

    }
}
