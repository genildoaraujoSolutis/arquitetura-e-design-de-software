package arquitetura_design_software.design_patterns.comportamentais.memento;

// Caretaker - Classe que mantém e gerencia os Mementos
class GerenciadorMementos {
    private Memento memento;

    public void salvarMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento obterUltimoMementoSalvo() {
        return memento;
    }
}
