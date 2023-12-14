package arquitetura_design_software.design_patterns.criacionais.abstract_factory;

// Implementação concreta da fábrica abstrata para criar a família de produtos 2
class FabricaConcreta2 implements FabricaAbstrata {
    @Override
    public ProdutoA criarProdutoA() {
        return new ProdutoA2();
    }

    @Override
    public ProdutoB criarProdutoB() {
        return new ProdutoB2();
    }
}