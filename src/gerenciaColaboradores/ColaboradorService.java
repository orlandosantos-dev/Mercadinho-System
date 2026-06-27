package gerenciaColaboradores;

import java.util.HashMap;
import java.util.Map;

public class ColaboradorService {
    // A chave é o nome (String), o valor é o objeto Funcionário
    private Map<String, Funcionario> mapaDeFuncionarios = new HashMap<>();

    public void adicionarFuncionario(Funcionario f) {
        mapaDeFuncionarios.put(f.nome, f);
    }

    public Funcionario buscarFuncionario(String nome) {
        return mapaDeFuncionarios.get(nome);
    }
}
