package arquitetura_design_software.design_patterns.estruturais.flyweight;

// Cliente que utiliza o padrão Flyweight
public class Cliente {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        // Usando Flyweights compartilhados
        Flyweight flyweight1 = flyweightFactory.getFlyweight("Estado1");
        flyweight1.operacaoCompartilhada();

        Flyweight flyweight2 = flyweightFactory.getFlyweight("Estado2");
        flyweight2.operacaoCompartilhada();

        // Usando o mesmo Flyweight novamente
        Flyweight flyweight3 = flyweightFactory.getFlyweight("Estado3");
        flyweight3.operacaoCompartilhada();
    }
}

