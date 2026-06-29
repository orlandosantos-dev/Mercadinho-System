package gerenciaColaboradores;

public class Main {
    public static void main(String[] args) {
        ColaboradorService service = new ColaboradorService();

        try {
            // Isso vai tentar criar o funcionário. Se der erro, ele pula para o catch.
            Funcionario f1 = new Funcionario("Teste", -500.0);
        } catch (IllegalArgumentException e) {
            // Aqui o programa avisa o erro, mas continua rodando o resto do código!
            System.out.println("Erro ao criar funcionário: " + e.getMessage());
        }

        // Adicionando os objetos no service
        // Agora o restante do sistema funciona normalmente:
        service.adicionarFuncionario(new Gerente("Hugo", 4000));
        service.adicionarFuncionario(new Estagiario("Orlando", 1621));
        service.adicionarFuncionario(new Funcionario("Carlos", 2000));

        RelatorioService serviceRelatorio = new RelatorioService();

        serviceRelatorio.exportarFolhaParaCSV(service.getMapaDeFuncionarios());

        // Executando a lógica
        service.exibirFolhaDePagamento();
    }
}
