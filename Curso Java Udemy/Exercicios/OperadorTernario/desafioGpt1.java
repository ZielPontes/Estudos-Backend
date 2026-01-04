/*Desafio 1: O Classificador de Clima (Switch Case + Ternário)
Crie um programa que peça ao usuário para digitar uma letra representando uma estação do ano:

P (Primavera), V (Verão), O (Outono), I (Inverno).*/

package OperadorTernario;

import java.util.Scanner;

public class desafioGpt1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma letra representando uma estação do ano [p], [v], [o], [i]: " );

        String estacao = sc.next().toLowerCase();

        String clima = switch (estacao){
            case "p" -> "Primavera: Flores e clima ameno.";
            case "v" -> "Verão: Muito calor e sol. Bom para ir a praia!";
            case "o" -> "Outono: Folhas caindo e ventinho fresco.";
            case "i" -> "Inverno: Hora de tirar o casaco do armário.";
            default -> "Inexistente";
        };
        String result = clima.equals("Inexistente")?
                "Erro: Estação inválida": "Relatório: " + clima;

        System.out.println(result);

        sc.close();
    }
}

