package arquitetura_design_software.design_patterns.comportamentais.command;

// Comando Concreto para desligar a luz
class ComandoDesligar implements Command {
    private Luz luz;

    public ComandoDesligar(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void executar() {
        luz.desligar();
    }
}
