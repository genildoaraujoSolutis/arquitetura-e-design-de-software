package arquitetura_design_software.design_patterns.criacionais.builder;

// Produto a ser construído
public class Produto {
    private String parteA;
    private String parteB;
    private String parteC;

    public void setParteA(String parteA) {
        this.parteA = parteA;
    }

    public void setParteB(String parteB) {
        this.parteB = parteB;
    }

    public void setParteC(String parteC) {
        this.parteC = parteC;
    }

    public void mostrarProduto() {
        System.out.println("Parte A: " + parteA);
        System.out.println("Parte B: " + parteB);
        System.out.println("Parte C: " + parteC);
    }
}
