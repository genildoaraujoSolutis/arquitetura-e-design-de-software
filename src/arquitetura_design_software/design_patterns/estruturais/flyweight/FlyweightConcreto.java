package arquitetura_design_software.design_patterns.estruturais.flyweight;

// Implementação concreta de Flyweight
class FlyweightConcreto implements Flyweight {
    private String estadoCompartilhado;

    public FlyweightConcreto(String estadoCompartilhado) {
        this.estadoCompartilhado = estadoCompartilhado;
    }

    @Override
    public void operacaoCompartilhada() {
        System.out.println("Operação compartilhada com estado: " + estadoCompartilhado);
    }
}
