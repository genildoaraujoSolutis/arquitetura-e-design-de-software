package arquitetura_design_software.design_patterns.estruturais.bridge;

// Abstração refinada (RefinedAbstraction)
class AbstracaoRefinada extends Abstracao {
    public AbstracaoRefinada(Implementacao implementacao) {
        super(implementacao);
    }

    @Override
    void operacaoAbstrata() {
        System.out.println("Operação abstrata da AbstracaoRefinada");
        implementacao.operacaoImplementada();
    }
}
