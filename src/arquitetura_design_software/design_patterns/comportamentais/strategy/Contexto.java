package arquitetura_design_software.design_patterns.comportamentais.strategy;

// Contexto - Utiliza uma estratégia
class Contexto {
    private Estrategia estrategia;

    public Contexto(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public void executarOperacao(int a, int b) {
        estrategia.executarOperacao(a, b);
    }
}
