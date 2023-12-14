package arquitetura_design_software.design_patterns.estruturais.decorator;

// Implementação concreta do Componente
class ComponenteConcreto implements Componente {
    @Override
    public void operacao() {
        System.out.println("Operação do ComponenteConcreto");
    }
}
