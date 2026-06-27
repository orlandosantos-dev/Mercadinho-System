package controleEstoque;

public class Produto {
    private String nome;
    private double preco;

    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);
    }

    // Getters
    public String getNome() { return nome; }
    public double getPreco() { return preco; }

    // Setter
    public void setPreco(double novoPreco) {
        if(novoPreco > 0) {
            this.preco = novoPreco;
        } else {
            System.out.println("Erro: Preço de " + this.nome + "' inválido.");
        }
    }

    public void aplicarDesconto(double porcentagem) {
        double valorDoAbatimento = this.preco * porcentagem;
        double novoPreco = this.preco - valorDoAbatimento;
        setPreco(novoPreco);
    }
}
