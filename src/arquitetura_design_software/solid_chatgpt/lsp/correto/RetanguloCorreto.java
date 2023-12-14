package arquitetura_design_software.solid_chatgpt.lsp.correto;

// Implementações concretas da interface Forma
class RetanguloCorreto implements Forma {
    protected int largura;
    protected int altura;

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int calcularArea() {
        return largura * altura;
    }
}
