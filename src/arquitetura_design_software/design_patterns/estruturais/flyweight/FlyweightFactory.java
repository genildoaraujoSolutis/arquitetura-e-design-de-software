package arquitetura_design_software.design_patterns.estruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

// FlyweightFactory - Fábrica de Flyweights
class FlyweightFactory {
    private Map<String, Flyweight> flyweights = new HashMap<>();

    // Obtém ou cria um Flyweight com base no estado compartilhado
    public Flyweight getFlyweight(String estadoCompartilhado) {
        if (!flyweights.containsKey(estadoCompartilhado)) {
            Flyweight flyweight = new FlyweightConcreto(estadoCompartilhado);
            flyweights.put(estadoCompartilhado, flyweight);
        }
        return flyweights.get(estadoCompartilhado);
    }
}
