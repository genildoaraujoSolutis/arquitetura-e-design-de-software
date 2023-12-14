package arquitetura_design_software.solid_chatgpt.isp.errado;

// Implementação da interface para um desenvolvedor
class Desenvolvedor implements Trabalhador {
    @Override
    public void trabalhar() {
        System.out.println("Desenvolvedor trabalhando...");
    }

    @Override
    public void comer() {
        System.out.println("Desenvolvedor comendo...");
    }

    @Override
    public void dormir() {
        System.out.println("Desenvolvedor dormindo...");
    }
}
