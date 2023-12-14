package arquitetura_design_software.design_patterns.estruturais.decorator;

// Outra implementação concreta de Decorador
class DecoradorConcretoB extends Decorador {
    public DecoradorConcretoB(Componente componente) {
        super(componente);
    }

    @Override
    public void operacao() {
        super.operacao();
        System.out.println("Operação do DecoradorConcretoB");
    }
}
