package arquitetura_design_software.solid_chatgpt.lsp.correto;

class QuadradoCorreto implements Forma {
    protected int lado;

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public int calcularArea() {
        return lado * lado;
    }
}
