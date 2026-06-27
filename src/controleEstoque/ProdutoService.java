package controleEstoque;

public class ProdutoService {

    // Regra de negócio: valida se o novo preço é válido e aplica a alteração
    public boolean atualizarPreco(Produto produto, double novoPreco) {
        if (novoPreco <= 0) {
            System.out.println("Falha ao atualizar: O preço deve ser maior que zero.");
            return false;
        }

        produto.setPreco(novoPreco);
        // Aqui também poderíamos adicionar uma chamada para salvar no banco de dados (Repository)
        // mantendo o padrão de arquitetura em camadas.
        return true;
    }
}
