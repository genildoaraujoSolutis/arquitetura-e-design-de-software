package arquitetura_design_software.design_patterns.criacionais.factory_method;

// Implementação concreta da interface FabricaProduto para criar ProdutoA
class FabricaProdutoA implements FabricaProduto {
    @Override
    public Produto criarProduto() {
        return new ProdutoA();
    }
}