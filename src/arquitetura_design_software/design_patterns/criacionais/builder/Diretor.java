package arquitetura_design_software.design_patterns.criacionais.builder;

// Diretor que controla o processo de construção
class Diretor {
    public void construirProduto(Builder builder) {
        builder.construirParteA();
        builder.construirParteB();
        builder.construirParteC();
    }
}