package arquitetura_design_software.design_patterns.comportamentais.state;

class EstadoFinal implements Estado {
    @Override
    public void lidarComAcao() {
        System.out.println("Estado Final - Executando ação final");
    }
}
