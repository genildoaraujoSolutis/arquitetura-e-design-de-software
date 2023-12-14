package arquitetura_design_software.design_patterns.comportamentais.iterator;

// Interface Iterator
interface Iterador<T> {
    boolean hasNext();

    T next();
}
