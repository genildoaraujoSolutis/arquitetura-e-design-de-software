package arquitetura_design_software.design_patterns.comportamentais.visitor;

// ElementoConcretoA - Implementação concreta de Elemento
class ElementoConcretoA implements Elemento {
    @Override
    public void aceitar(Visitante visitante) {
        visitante.visitarElementoConcretoA(this);
    }

    public String operacaoA() {
        return "Operação A do ElementoConcretoA";
    }
}
