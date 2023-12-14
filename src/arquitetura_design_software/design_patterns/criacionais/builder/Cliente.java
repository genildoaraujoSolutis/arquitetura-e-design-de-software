package arquitetura_design_software.design_patterns.criacionais.builder;

// Cliente que utiliza o padrão Builder
public class Cliente {
    public static void main(String[] args) {
        // Criando um construtor específico
        Builder construtor = new ConstrutorProdutoA();

        // Criando um diretor
        Diretor diretor = new Diretor();

        // Construindo o produto
        diretor.construirProduto(construtor);

        // Obtendo o produto construído
        Produto produtoFinal = construtor.obterProduto();

        // Exibindo o produto
        produtoFinal.mostrarProduto();
    }
}