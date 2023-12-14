package arquitetura_design_software.design_patterns.criacionais.abstract_factory;

// Implementação concreta da interface ProdutoB
class ProdutoB1 implements ProdutoB {
    @Override
    public void exibirInfoB() {
        System.out.println("Produto B1");
    }
}