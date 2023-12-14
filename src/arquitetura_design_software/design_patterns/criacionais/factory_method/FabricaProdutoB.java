package arquitetura_design_software.design_patterns.criacionais.factory_method;

// Implementação concreta da interface FabricaProduto para criar ProdutoB
class FabricaProdutoB implements FabricaProduto {
    @Override
    public Produto criarProduto() {
        return new ProdutoB();
    }
}