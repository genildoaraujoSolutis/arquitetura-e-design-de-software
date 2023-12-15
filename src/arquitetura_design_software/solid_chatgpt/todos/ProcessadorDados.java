package arquitetura_design_software.solid_chatgpt.todos;

//Dependency Inversion Principle (DIP): A classe de alto nível ProcessadorDados depende da
// abstração OperacoesIO em vez de depender diretamente da implementação concreta (ManipuladorArquivo).
// Isso permite a injeção de dependência e torna o código mais flexível.

// Classe de alto nível para processar dados
class ProcessadorDados {
    private OperacoesIO operacoesIO;

    public ProcessadorDados(OperacoesIO operacoesIO) {
        this.operacoesIO = operacoesIO;
    }

    public void processar() {
        // Lógica de processamento
        System.out.println("Processando dados...");

        // Lendo dados usando a interface OperacoesIO
        String dados = operacoesIO.ler();
        System.out.println("Dados lidos: " + dados);

        // Escrevendo dados usando a interface OperacoesIO
        operacoesIO.escrever("Novo Conteúdo");

        // Mais lógica de processamento...
    }
}
