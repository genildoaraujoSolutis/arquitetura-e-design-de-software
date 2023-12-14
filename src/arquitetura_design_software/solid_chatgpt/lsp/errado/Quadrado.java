package arquitetura_design_software.solid_chatgpt.lsp.errado;

// Classe derivada que viola o LSP
class Quadrado extends Retangulo {
    @Override
    public void setLargura(int largura) {
        super.setLargura(largura);
        super.setAltura(largura); // Violação: Largura e altura devem ser independentes
    }

    @Override
    public void setAltura(int altura) {
        super.setAltura(altura);
        super.setLargura(altura); // Violação: Largura e altura devem ser independentes
    }
}
