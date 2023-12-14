package arquitetura_design_software.design_patterns.comportamentais.visitor;

// ElementoConcretoB - Implementação concreta de Elemento
class ElementoConcretoB implements Elemento {
    @Override
    public void aceitar(Visitante visitante) {
        visitante.visitarElementoConcretoB(this);
    }

    public String operacaoB() {
        return "Operação B do ElementoConcretoB";
    }
}
