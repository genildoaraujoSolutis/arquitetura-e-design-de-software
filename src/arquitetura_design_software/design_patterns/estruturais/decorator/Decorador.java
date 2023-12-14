package arquitetura_design_software.design_patterns.estruturais.decorator;

// Decorador - Classe abstrata que estende Componente e contém uma referência ao Componente
abstract class Decorador implements Componente {
    protected Componente componente;

    public Decorador(Componente componente) {
        this.componente = componente;
    }

    @Override
    public void operacao() {
        componente.operacao();
    }
}
