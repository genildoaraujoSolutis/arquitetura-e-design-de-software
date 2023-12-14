package arquitetura_design_software.design_patterns.estruturais.bridge;

// Abstração (Abstraction)
abstract class Abstracao {
    protected Implementacao implementacao;

    public Abstracao(Implementacao implementacao) {
        this.implementacao = implementacao;
    }

    abstract void operacaoAbstrata();
}
