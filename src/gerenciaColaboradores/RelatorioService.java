package gerenciaColaboradores;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class RelatorioService {
    public void exportarFolhaParaCSV(Map<String, Funcionario> funcionarios) {
        // Usando try-with-resources para garantir que o arquivo feche sozinho
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("folha_pagamento.csv"))) {
            writer.write("Nome,Salario");
            writer.newLine();
            for (Funcionario f : funcionarios.values()) {
                writer.write(f.nome + "," + f.calcularSalario());
                writer.newLine();
            }
            System.out.println("Relatório gerado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao gerar arquivo: " + e.getMessage());
        }
    }
}
