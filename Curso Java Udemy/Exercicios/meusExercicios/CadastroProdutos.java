/*🏋️ Exercício 02: Cadastro de Produto
Imagine que você está criando um sistema para um almoxarifado. O programa deve pedir os seguintes dados de um produto:

O nome do produto (pode ter espaços).

A letra inicial do código do setor (um único caractere).

A quantidade em estoque (inteiro).

O preço unitário.

Ao final, exiba uma frase resumindo os dados e o valor total em estoque (quantidade * preço).*/

package meusExercicios;

import java.util.Locale;
import java.util.Scanner;

public class CadastroProdutos {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        System.out.printf("%n--- Cadastro de Produtos ---");
        System.out.printf("%n-------------------------------%n");
        Scanner sc = new Scanner(System.in);

        // Nome produto
        System.out.println("Informe o nome do produto: ");
        String nomeProduto = sc.nextLine();
        
        // Código do Setor
        System.out.println("Informe o código do Setor: ");
        char codSetor = sc.next().charAt(0);

        // Quantidade Estoque
        IO.println("Informe a Qnt: ");
        int qnt = sc.nextInt();
        // Preço
        IO.println("Informe o preço: ");
        float preco = sc.nextFloat();
        double capital = (double) preco * qnt;
        ////////// EXIBINDO DADOS ////////

        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Código: " + codSetor);
        System.out.printf("Quantidade em estoque: %d.%n", qnt);
        System.out.printf("Capital total: %.2f%n", capital);
        
        sc.close();
    }

}
