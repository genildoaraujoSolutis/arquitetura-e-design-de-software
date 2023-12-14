package arquitetura_design_software.solid_chatgpt.srp.errado;

// Cliente que utiliza as classes separadas
public class Cliente {
    public static void main(String[] args) {
        // Utilizando a classe original com múltiplas responsabilidades
        ManipuladorArquivo manipulador = new ManipuladorArquivo();
        String conteudo = manipulador.lerArquivo("arquivo.txt");
        System.out.println(conteudo);
        manipulador.salvarArquivo("novo-arquivo.txt", "Novo conteúdo");
    }
}

