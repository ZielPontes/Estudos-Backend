package br.com.gestor.app;

import br.com.gestor.model.Saida;
import br.com.gestor.service.EntradaService;

import java.time.LocalDateTime;

public class Main {
    static void main(String[] args) {
        // 1 - Chamando a ferramenta Service e nomeando como "in".
        EntradaService in = new EntradaService();

        // 2. Chamamos o método e GUARDAMOS o que ele devolve na variável "s".
        Saida s = in.lerNovaSaida();

        System.out.println("----- RELATÓRIO DE SAÍDA -----");
        System.out.println("Data: " + s.dataHora());
        System.out.printf("Valor da saída: R$%.2f%n", s.valorBruto());
        System.out.printf("Total gastos: R$%.2f%n", s.despesas());
        System.out.printf("Total Km percorrido: %d%n", s.kmRodados());
        System.out.printf("%n--------- RESULTADOS ---------%n");
        System.out.printf("Lucro líquido: R$%.2f%n", s.lucroLiquido());
        System.out.printf("Receita Bruta por Km: R$%.2f%n", s.faturamentoPorKm());
        System.out.printf("Lucro por Km: R$%.2f%n", s.lucroPorKm());
        System.out.printf("Receita bruta por Hora: R$%.2f%n", s.brutoPorHora());
        System.out.printf("Lucro por Hora: R$%.2f%n", s.ganhoPorHora());
        System.out.printf("Despesa por Km: R$%.2f%n", s.despesaPorKm());



    }
}
