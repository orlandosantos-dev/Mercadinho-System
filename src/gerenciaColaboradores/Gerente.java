package gerenciaColaboradores;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        // "super" chama o construtor da classe Funcionario
        super(nome, salarioBase);
    }

    // A mágica do Polimorfismo
    @Override
    public double calcularSalario() {
        // Regra: Salário + 20%
        return this.salarioBase * 1.20;
    }
}
