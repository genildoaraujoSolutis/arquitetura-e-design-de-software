package arquitetura_design_software.design_patterns.comportamentais.command;

// Comando Concreto para ligar a luz
class ComandoLigar implements Command {
    private Luz luz;

    public ComandoLigar(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void executar() {
        luz.ligar();
    }
}
