package arquitetura_design_software.design_patterns.comportamentais.command;

// Invocador
class ControleRemoto {
    private Command comando;

    public void setComando(Command comando) {
        this.comando = comando;
    }

    public void pressionarBotao() {
        comando.executar();
    }
}
