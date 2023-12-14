package arquitetura_design_software.design_patterns.comportamentais.visitor;

// VisitanteConcreto - Implementação concreta de Visitante
class VisitanteConcreto implements Visitante {
    @Override
    public void visitarElementoConcretoA(ElementoConcretoA elemento) {
        System.out.println("VisitanteConcreto está visitando " + elemento.operacaoA());
    }

    @Override
    public void visitarElementoConcretoB(ElementoConcretoB elemento) {
        System.out.println("VisitanteConcreto está visitando " + elemento.operacaoB());
    }
}
