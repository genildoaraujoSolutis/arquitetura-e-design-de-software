package arquitetura_design_software.solid_chatgpt.todos;

//Single Responsibility Principle (SRP): A classe `ManipuladorArquivo`
// tem a responsabilidade única de lidar com operações de leitura e escrita em arquivos.
//Open-Closed Principle (OCP): A classe `ManipuladorArquivo` pode ser estendida sem modificar
// seu código para lidar com diferentes tipos de armazenamento (por exemplo, banco de dados)
// implementando a interface `OperacoesIO`.
//Liskov Substitution Principle (LSP): A classe ManipuladorArquivo é uma substituição válida
// para a interface OperacoesIO. A classe derivada (ManipuladorArquivo) pode ser usada onde a
// classe base (OperacoesIO) é esperada.

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
