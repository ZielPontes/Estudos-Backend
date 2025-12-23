package br.com.gestor.model;

import java.time.LocalDateTime;

public record Saida(
        LocalDateTime dataHora,
        int kmInicial,
        int kmFinal,
        double valorBruto,
        double despesas,
        double horasTrabalhadas
) {
        public  double lucroLiquido(){ //Retorna lucro depois das despesas
            return valorBruto - despesas;
        }
        public int kmRodados(){ // Exibe Km rodados
            return kmFinal - kmInicial;
        }
        public double faturamentoPorKm(){
            return valorBruto / kmRodados();
        }
        public double lucroPorKm(){ // Exibe lucro por km percorridos.
            return lucroLiquido() / kmRodados();
        }
        public double despesaPorKm(){ // Exibe despesa por Km.
            return despesas / kmRodados();
        }
        public double ganhoPorHora(){
            return lucroLiquido() / horasTrabalhadas;
        }
        public double brutoPorHora(){
            return valorBruto / horasTrabalhadas;
        }
}
