package arquitetura_design_software.solid_chatgpt.isp.correto;

// Implementação das interfaces para um desenvolvedor
class Desenvolvedor implements Trabalhador, Comedor {
    @Override
    public void trabalhar() {
        System.out.println("Desenvolvedor trabalhando...");
    }

    @Override
    public void comer() {
        System.out.println("Desenvolvedor comendo...");
    }
}
