package arquitetura_design_software.design_patterns.comportamentais.strategy;

class Subtracao implements Estrategia {
    @Override
    public void executarOperacao(int a, int b) {
        System.out.println("Subtração: " + (a - b));
    }
}
