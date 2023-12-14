package arquitetura_design_software.design_patterns.criacionais.factory_method;

// Implementação concreta da interface Produto
class ProdutoA implements Produto {
    @Override
    public void exibirInfo() {
        System.out.println("Produto A");
    }
}
