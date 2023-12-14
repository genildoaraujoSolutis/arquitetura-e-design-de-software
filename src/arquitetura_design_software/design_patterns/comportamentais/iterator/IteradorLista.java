package arquitetura_design_software.design_patterns.comportamentais.iterator;

import java.util.List;

// Implementação concreta do Iterador
class IteradorLista<T> implements Iterador<T> {
    private List<T> lista;
    private int indice;

    public IteradorLista(List<T> lista) {
        this.lista = lista;
        this.indice = 0;
    }

    @Override
    public boolean hasNext() {
        return indice < lista.size();
    }

    @Override
    public T next() {
        if (hasNext()) {
            return lista.get(indice++);
        }
        return null;
    }
}
