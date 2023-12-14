package arquitetura_design_software.design_patterns.comportamentais.command;

// Receptor
class Luz {
    void ligar() {
        System.out.println("Luz ligada");
    }

    void desligar() {
        System.out.println("Luz desligada");
    }
}
