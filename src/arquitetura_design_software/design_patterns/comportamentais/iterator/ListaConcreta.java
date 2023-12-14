package arquitetura_design_software.design_patterns.comportamentais.iterator;

import java.util.ArrayList;
import java.util.List;

// Implementação concreta do Agregado
class ListaConcreta<T> implements Agregado<T> {
    private List<T> elementos = new ArrayList<>();

    public void adicionarElemento(T elemento) {
        elementos.add(elemento);
    }

    @Override
    public Iterador<T> criarIterador() {
        return new IteradorLista<>(elementos);
    }
}
