package arquitetura_design_software.solid_chatgpt.srp.errado;

// Classe com múltiplas responsabilidades
class ManipuladorArquivo {
    public String lerArquivo(String nomeArquivo) {
        // Lógica para ler o arquivo
        return "Conteúdo do arquivo: " + nomeArquivo;
    }

    public void salvarArquivo(String nomeArquivo, String conteudo) {
        // Lógica para salvar o conteúdo no arquivo
        System.out.println("Salvando arquivo: " + nomeArquivo);
        System.out.println("Conteúdo: " + conteudo);
    }
}
