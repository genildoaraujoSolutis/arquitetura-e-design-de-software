package arquitetura_design_software.design_patterns.criacionais.builder;

// Implementação concreta do Builder
public class ConstrutorProdutoA implements Builder {

    private Produto produto = new Produto();

    @Override
    public void construirParteA() {
        produto.setParteA("Parte A do Produto A");
    }

    @Override
    public void construirParteB() {
        produto.setParteB("Parte B do Produto A");
    }

    @Override
    public void construirParteC() {
        produto.setParteC("Parte C do Produto A");
    }

    @Override
    public Produto obterProduto() {
        return produto;
    }
}
