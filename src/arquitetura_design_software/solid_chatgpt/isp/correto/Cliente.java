package arquitetura_design_software.solid_chatgpt.isp.correto;

public class Cliente {
    public static void main(String[] args) {
        // Jeito Certo (ISP)
        Desenvolvedor desenvolvedor = new Desenvolvedor();
        desenvolvedor.trabalhar();
        desenvolvedor.comer();
    }
}


