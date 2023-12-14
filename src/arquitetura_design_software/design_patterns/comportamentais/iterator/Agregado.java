package arquitetura_design_software.design_patterns.comportamentais.iterator;

// Interface Agregado
interface Agregado<T> {
    Iterador<T> criarIterador();
}
