package arquitetura_design_software.design_patterns.comportamentais.strategy;

class Multiplicacao implements Estrategia {
    @Override
    public void executarOperacao(int a, int b) {
        System.out.println("Multiplicação: " + (a * b));
    }
}
