package arquitetura_design_software.design_patterns.comportamentais.template_method;

// Cliente que utiliza o padrão Template Method
public class Cliente {
    public static void main(String[] args) {
        // Criando uma instância do Algoritmo Concreto
        Algoritmo algoritmo = new AlgoritmoConcreto();

        // Executando o Template Method
        algoritmo.executar();
    }
}

