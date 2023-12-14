package arquitetura_design_software.design_patterns.criacionais.abstract_factory;

// Interface que define a fábrica abstrata
interface FabricaAbstrata {
    ProdutoA criarProdutoA();
    ProdutoB criarProdutoB();
}