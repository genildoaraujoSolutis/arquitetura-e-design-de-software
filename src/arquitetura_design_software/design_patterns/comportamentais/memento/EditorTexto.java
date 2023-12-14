package arquitetura_design_software.design_patterns.comportamentais.memento;

// Originator - Classe que mantém o estado interno
class EditorTexto {
    private String texto;

    public void escreverTexto(String texto) {
        this.texto = texto;
    }

    public String obterTexto() {
        return texto;
    }

    public Memento salvarEstado() {
        return new Memento(texto);
    }

    public void restaurarEstado(Memento memento) {
        this.texto = memento.getTextoSalvo();
    }
}
