package arquitetura_design_software.design_patterns.criacionais.builder;

// Interface do Builder
public interface Builder {
    void construirParteA();
    void construirParteB();
    void construirParteC();
    Produto obterProduto();
}
