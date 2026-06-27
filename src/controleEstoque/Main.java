package controleEstoque;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instancia o produto e o scanner (simulando o seu fluxo inicial)
        Produto p = new Produto("Café Premium", 50.0);
        Scanner scanner = new Scanner(System.in);

        // Instanciamos a camada de serviço (injeção de dependência manual / Service Layer)
        ProdutoService produtoService = new ProdutoService();

        System.out.println("Deseja atualizar o preço do produto? (S/N): ");
        String resp = scanner.nextLine();

        if (resp.trim().toUpperCase().startsWith("S")) {
            double novoPreco = 0;
            do {
                System.out.print("\nDigite o novo preço do " + p.getNome() + ": ");
                try {
                    novoPreco = scanner.nextDouble();

                    // Delegamos a atualização para o Service
                    boolean sucesso = produtoService.atualizarPreco(p, novoPreco);

                    if (sucesso) {
                        System.out.println("Preço atualizado com sucesso! Novo valor: R$ " + p.getPreco());
                    } else {
                        novoPreco = 0; // Força o loop a continuar caso falhe
                    }

                } catch (java.util.InputMismatchException e) {
                    System.out.println("Erro: Digite apenas números usando vírgula (ex: 50,0)");
                    novoPreco = 0;
                } finally {
                    scanner.nextLine();
                }
            } while (p.getPreco() <= 0 || novoPreco == 0);
        }
        System.out.println("Fim do programa. Preço final do produto: R$" + p.getPreco());
        scanner.close();
    }
}

        // Aplicando um desconto de 10% (0.10)
       // p1.aplicarDesconto(0.10);

        // Testando a segurança (tentar dar um desconto que zera o preço)
        // p1.aplicarDesconto(0.95);
