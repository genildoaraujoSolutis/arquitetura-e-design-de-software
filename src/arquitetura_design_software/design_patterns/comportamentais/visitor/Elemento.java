package arquitetura_design_software.design_patterns.comportamentais.visitor;

// Element - Interface que representa um elemento visitável
interface Elemento {
    void aceitar(Visitante visitante);
}
