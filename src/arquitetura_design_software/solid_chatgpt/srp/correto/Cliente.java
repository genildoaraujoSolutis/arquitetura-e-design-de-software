package arquitetura_design_software.solid_chatgpt.srp.correto;

// Cliente que utiliza as classes separadas
public class Cliente {
    public static void main(String[] args) {
        // Utilizando as classes separadas para cada responsabilidade
        LeitorArquivo leitor = new LeitorArquivo();
        String conteudo = leitor.lerArquivo("arquivo.txt");
        System.out.println(conteudo);

        SalvaArquivo salvador = new SalvaArquivo();
        salvador.salvarArquivo("novo-arquivo.txt", "Novo conteúdo");
    }
}

