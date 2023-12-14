package arquitetura_design_software.design_patterns.estruturais.decorator;

// Cliente que utiliza o padrão Decorator
public class Cliente {
    public static void main(String[] args) {
        // Criando um componente concreto
        Componente componente = new ComponenteConcreto();

        // Adicionando decoradores
        Componente decoradorA = new DecoradorConcretoA(componente);
        Componente decoradorB = new DecoradorConcretoB(decoradorA);

        // Chamando a operação, que agora inclui as operações dos decoradores
        decoradorB.operacao();
    }
}

