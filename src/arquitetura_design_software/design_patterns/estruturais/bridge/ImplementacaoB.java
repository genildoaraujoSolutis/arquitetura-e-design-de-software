package arquitetura_design_software.design_patterns.estruturais.bridge;

// Implementação concreta (ConcreteImplementorB)
class ImplementacaoB implements Implementacao {
    @Override
    public void operacaoImplementada() {
        System.out.println("Implementação B");
    }
}
