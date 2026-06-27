package gerenciaColaboradores;

public class Estagiario extends Funcionario{
    public Estagiario(String nome, double salarioBase) {
        // "super" chama o construtor da classe Funcionario
        super(nome, salarioBase);
    }
}
