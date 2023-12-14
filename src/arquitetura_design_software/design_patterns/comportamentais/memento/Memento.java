package arquitetura_design_software.design_patterns.comportamentais.memento;

// Memento - Classe que armazena o estado interno do Originator
class Memento {
    private String textoSalvo;

    public Memento(String texto) {
        this.textoSalvo = texto;
    }

    public String getTextoSalvo() {
        return textoSalvo;
    }
}
