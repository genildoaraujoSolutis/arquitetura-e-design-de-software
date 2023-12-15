package arquitetura_design_software.solid_chatgpt.todos;

// Implementação concreta para leitura e escrita em arquivos
class ManipuladorArquivo implements OperacoesIO {
    private String nomeArquivo;

    public ManipuladorArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public String ler() {
        // Lógica para ler do arquivo
        System.out.println("Lendo do arquivo: " + nomeArquivo);
        // ... lógica de leitura ...
        return "Conteúdo lido do arquivo";
    }

    @Override
    public void escrever(String conteudo) {
        // Lógica para escrever no arquivo
        System.out.println("Escrevendo no arquivo: " + nomeArquivo + " o conteúdo: " + conteudo);
        // ... lógica de escrita ...
    }
}
