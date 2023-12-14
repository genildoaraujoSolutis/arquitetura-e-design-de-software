package arquitetura_design_software.design_patterns.comportamentais.memento;

// Cliente que utiliza o padrão Memento
public class Cliente {
    public static void main(String[] args) {
        // Criando o Originator (Editor de Texto)
        EditorTexto editorTexto = new EditorTexto();

        // Criando o Caretaker (Gerenciador de Mementos)
        GerenciadorMementos gerenciadorMementos = new GerenciadorMementos();

        // Escrevendo texto e salvando o estado
        editorTexto.escreverTexto("Primeiro texto");
        gerenciadorMementos.salvarMemento(editorTexto.salvarEstado());

        // Escrevendo novo texto e salvando o estado
        editorTexto.escreverTexto("Segundo texto");
        gerenciadorMementos.salvarMemento(editorTexto.salvarEstado());

        // Obtendo o último estado salvo e restaurando
        Memento ultimoMemento = gerenciadorMementos.obterUltimoMementoSalvo();
        editorTexto.restaurarEstado(ultimoMemento);

        // Obtendo o texto atual após a restauração
        System.out.println("Texto atual: " + editorTexto.obterTexto());
    }
}

