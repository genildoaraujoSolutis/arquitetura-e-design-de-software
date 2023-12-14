package arquitetura_design_software.design_patterns.comportamentais.visitor;

// Visitante - Interface que define métodos de visita para cada tipo de Elemento
interface Visitante {
    void visitarElementoConcretoA(ElementoConcretoA elemento);

    void visitarElementoConcretoB(ElementoConcretoB elemento);
}
