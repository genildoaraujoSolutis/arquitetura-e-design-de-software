package arquitetura_design_software.design_patterns.comportamentais.state;

// Context - Mantém uma referência para o estado atual
class Contexto {
    private Estado estado;

    public Contexto() {
        // Inicializa com um estado inicial
        this.estado = new EstadoInicial();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void realizarAcao() {
        estado.lidarComAcao();
    }
}
