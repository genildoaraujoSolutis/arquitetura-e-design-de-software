package arquitetura_design_software.design_patterns.criacionais.abstract_factory;

// Implementação concreta da fábrica abstrata para criar a família de produtos 1
class FabricaConcreta1 implements FabricaAbstrata {
    @Override
    public ProdutoA criarProdutoA() {
        return new ProdutoA1();
    }

    @Override
    public ProdutoB criarProdutoB() {
        return new ProdutoB1();
    }
}