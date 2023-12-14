package arquitetura_design_software.design_patterns.comportamentais.strategy;

// Implementações concretas de Strategy
class Soma implements Estrategia {
    @Override
    public void executarOperacao(int a, int b) {
        System.out.println("Soma: " + (a + b));
    }
}
