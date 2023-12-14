package arquitetura_design_software.design_patterns.comportamentais.state;

// Implementações concretas de State
class EstadoInicial implements Estado {
    @Override
    public void lidarComAcao() {
        System.out.println("Estado Inicial - Executando ação inicial");
    }
}
