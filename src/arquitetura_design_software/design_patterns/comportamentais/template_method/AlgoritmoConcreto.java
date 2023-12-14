package arquitetura_design_software.design_patterns.comportamentais.template_method;

// Implementação concreta do Template Method
class AlgoritmoConcreto extends Algoritmo {
    @Override
    void passo1() {
        System.out.println("Passo 1 do Algoritmo Concreto");
    }

    @Override
    void passo2() {
        System.out.println("Passo 2 do Algoritmo Concreto");
    }

    @Override
    void passo3() {
        System.out.println("Passo 3 modificado no Algoritmo Concreto");
    }
}
