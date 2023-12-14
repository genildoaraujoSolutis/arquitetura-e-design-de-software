package arquitetura_design_software.solid_chatgpt.lsp.correto;

public class Cliente {
    public static void main(String[] args) {
        // Jeito Certo (LSP)
        RetanguloCorreto retangulo = new RetanguloCorreto();
        retangulo.setLargura(5);
        retangulo.setAltura(10);
        System.out.println("Área do retângulo: " + retangulo.calcularArea());

        QuadradoCorreto quadrado = new QuadradoCorreto();
        quadrado.setLado(7);
        System.out.println("Área do quadrado: " + quadrado.calcularArea());
    }
}


