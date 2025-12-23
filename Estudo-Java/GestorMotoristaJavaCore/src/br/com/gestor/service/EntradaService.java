package br.com.gestor.service;

import br.com.gestor.model.Saida;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class EntradaService {
    public Saida lerNovaSaida(){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("\n--- REGISTRO DE NOVA SAÍDA ---");

        System.out.print("Km Inicial: ");
        int kmI = sc.nextInt();

        System.out.print("Km Final: ");
        int kmF = sc.nextInt();

        System.out.print("Despesas totais (R$): ");
        double desp = sc.nextDouble();

        System.out.print("Total de horas trabalhadas: ");
        double horas = sc.nextDouble();

        System.out.print("Pagamento por saída (R$): ");
        double valorSaida = sc.nextDouble();

        return new Saida(LocalDateTime.now(), kmI, kmF, valorSaida, desp, horas);
    }
}
