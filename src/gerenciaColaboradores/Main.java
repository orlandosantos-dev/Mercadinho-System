package gerenciaColaboradores;

public class Main {
    public static void main(String[] args) {
        ColaboradorService service = new ColaboradorService();

        // Adicionando os objetos no service
        service.adicionarFuncionario(new Gerente("Hugo", 4000));
        service.adicionarFuncionario(new Estagiario("Orlando", 1621));
        service.adicionarFuncionario(new Funcionario("Carlos", 2000));

        // Executando a lógica
        service.exibirFolhaPagamento();
    }
}
