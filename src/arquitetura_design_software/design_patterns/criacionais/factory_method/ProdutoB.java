package arquitetura_design_software.design_patterns.criacionais.factory_method;

// Outra implementação concreta da interface Produto
class ProdutoB implements Produto {
    @Override
    public void exibirInfo() {
        System.out.println("Produto B");
    }
}