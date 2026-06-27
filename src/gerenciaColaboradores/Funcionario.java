package gerenciaColaboradores;

public class Funcionario {

    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // O método base que será "polimorfizado" depois
    public double calcularSalario() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0 ) {
            // Isso interrompe o programa se o valor for inválido
            throw new IllegalArgumentException("O salário não pode ser negativo!");
        }
        this.salarioBase = salarioBase;
    }
}
