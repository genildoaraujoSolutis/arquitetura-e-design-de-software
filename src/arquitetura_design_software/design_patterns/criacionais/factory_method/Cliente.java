package arquitetura_design_software.design_patterns.criacionais.factory_method;

// Cliente que utiliza o Factory Method para criar produtos
public class Cliente {
    public static void main(String[] args) {
        // Utilizando a fábrica para criar ProdutoA
        FabricaProduto fabricaA = new FabricaProdutoA();
        Produto produtoA = fabricaA.criarProduto();
        produtoA.exibirInfo();

        // Utilizando a fábrica para criar ProdutoB
        FabricaProduto fabricaB = new FabricaProdutoB();
        Produto produtoB = fabricaB.criarProduto();
        produtoB.exibirInfo();
    }
}