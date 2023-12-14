package arquitetura_design_software.design_patterns.estruturais.facade;

// Facade - Fornece uma interface unificada para os subsistemas
class Facade {
    private Subsistema1 subsistema1;
    private Subsistema2 subsistema2;
    private Subsistema3 subsistema3;

    public Facade() {
        this.subsistema1 = new Subsistema1();
        this.subsistema2 = new Subsistema2();
        this.subsistema3 = new Subsistema3();
    }

    // Métodos da fachada que encapsulam as operações dos subsistemas
    void operacaoFacade() {
        subsistema1.operacao1();
        subsistema2.operacao2();
        subsistema3.operacao3();
    }
}
