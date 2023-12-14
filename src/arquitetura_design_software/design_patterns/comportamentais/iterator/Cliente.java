package arquitetura_design_software.design_patterns.comportamentais.iterator;

// Cliente que utiliza o padrão Iterator
public class Cliente {
    public static void main(String[] args) {
        // Criando uma lista de elementos
        ListaConcreta<String> lista = new ListaConcreta<>();
        lista.adicionarElemento("Elemento 1");
        lista.adicionarElemento("Elemento 2");
        lista.adicionarElemento("Elemento 3");

        // Criando um iterador para percorrer a lista
        Iterador<String> iterador = lista.criarIterador();

        // Iterando sobre os elementos da lista
        while (iterador.hasNext()) {
            String elemento = iterador.next();
            System.out.println("Elemento: " + elemento);
        }
    }
}

