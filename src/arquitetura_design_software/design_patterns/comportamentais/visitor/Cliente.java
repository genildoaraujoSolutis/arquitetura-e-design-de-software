package arquitetura_design_software.design_patterns.comportamentais.visitor;

// Cliente que utiliza o padrão Visitor
public class Cliente {
    public static void main(String[] args) {
        // Criando elementos
        ElementoConcretoA elementoA = new ElementoConcretoA();
        ElementoConcretoB elementoB = new ElementoConcretoB();

        // Criando visitante
        VisitanteConcreto visitante = new VisitanteConcreto();

        // Aceitando visitante nos elementos
        elementoA.aceitar(visitante);
        elementoB.aceitar(visitante);
    }
}

