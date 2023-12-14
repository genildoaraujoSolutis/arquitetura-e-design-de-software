package arquitetura_design_software.design_patterns.criacionais.abstract_factory;

// Cliente que utiliza a fábrica abstrata para criar famílias de produtos
public class Cliente {
    public static void main(String[] args) {
        // Utilizando a fábrica abstrata para criar a família de produtos 1
        FabricaAbstrata fabrica1 = new FabricaConcreta1();
        ProdutoA produtoA1 = fabrica1.criarProdutoA();
        ProdutoB produtoB1 = fabrica1.criarProdutoB();

        produtoA1.exibirInfoA();
        produtoB1.exibirInfoB();

        // Utilizando a fábrica abstrata para criar a família de produtos 2
        FabricaAbstrata fabrica2 = new FabricaConcreta2();
        ProdutoA produtoA2 = fabrica2.criarProdutoA();
        ProdutoB produtoB2 = fabrica2.criarProdutoB();

        produtoA2.exibirInfoA();
        produtoB2.exibirInfoB();
    }
}

