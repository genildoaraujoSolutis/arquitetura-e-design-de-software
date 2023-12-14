package arquitetura_design_software.design_patterns.estruturais.bridge;

// Implementação concreta (ConcreteImplementorA)
class ImplementacaoA implements Implementacao {
    @Override
    public void operacaoImplementada() {
        System.out.println("Implementação A");
    }
}
