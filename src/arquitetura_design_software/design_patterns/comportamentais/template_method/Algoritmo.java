package arquitetura_design_software.design_patterns.comportamentais.template_method;

// Classe abstrata que define o Template Method
abstract class Algoritmo {
    // Template Method
    public final void executar() {
        passo1();
        passo2();
        passo3();
    }

    // Passo 1 - Deve ser implementado pelas subclasses
    abstract void passo1();

    // Passo 2 - Deve ser implementado pelas subclasses
    abstract void passo2();

    // Passo 3 - Pode ser opcionalmente sobrescrito pelas subclasses
    void passo3() {
        System.out.println("Passo 3 padrão");
    }
}
