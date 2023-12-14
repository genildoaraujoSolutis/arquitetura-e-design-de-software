package arquitetura_design_software.design_patterns.comportamentais.state;

class EstadoIntermediario implements Estado {
    @Override
    public void lidarComAcao() {
        System.out.println("Estado Intermediário - Executando ação intermediária");
    }
}
