package gerenciaColaboradores;

import java.util.HashMap;
import java.util.Map;

public class ColaboradorService {
    // A chave é o nome (String), o valor é o objeto Funcionário
    private final Map<String, Funcionario> mapaDeFuncionarios = new HashMap<>();

    public void adicionarFuncionario(Funcionario f) {
        mapaDeFuncionarios.put(f.nome, f);
    }

    public Map<String, Funcionario> getMapaDeFuncionarios() {
        return mapaDeFuncionarios;
    }
    public Funcionario buscarFuncionario(String nome) {
        return mapaDeFuncionarios.get(nome);
    }

    public void exibirFolhaDePagamento(){
       for (Funcionario f : mapaDeFuncionarios.values()) {
           System.out.println("Colaborador: " + f.nome);
           System.out.println("Salário: | R$ " + f.salarioBase);
       }
    }
}
