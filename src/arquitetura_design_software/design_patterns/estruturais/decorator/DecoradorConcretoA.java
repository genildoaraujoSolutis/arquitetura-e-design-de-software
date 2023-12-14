package arquitetura_design_software.design_patterns.estruturais.decorator;

// DecoradorConcreto - Implementação concreta de Decorador
class DecoradorConcretoA extends Decorador {
    public DecoradorConcretoA(Componente componente) {
        super(componente);
    }

    @Override
    public void operacao() {
        super.operacao();
        System.out.println("Operação do DecoradorConcretoA");
    }
}
