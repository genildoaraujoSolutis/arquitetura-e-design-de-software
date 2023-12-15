package arquitetura_design_software.solid_chatgpt.todos;

public class Cliente {
    public static void main(String[] args) {
        // Aplicando Dependency Inversion Principle (DIP) através da injeção de dependência
        OperacoesIO manipuladorArquivo = new ManipuladorArquivo("arquivo.txt");
        ProcessadorDados processador = new ProcessadorDados(manipuladorArquivo);

        // Executando o processamento
        processador.processar();
    }
}

