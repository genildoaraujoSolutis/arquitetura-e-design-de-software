package arquitetura_design_software.design_patterns.estruturais.adpter;

// Adapter: adapta a interface Adaptada para a interface Alvo
class Adaptador implements Alvo {
    private Adaptada adaptada;

    public Adaptador(Adaptada adaptada) {
        this.adaptada = adaptada;
    }

    @Override
    public void operacao() {
        adaptada.operacaoAdaptada();
    }
}
