package arquitetura_design_software.design_patterns.comportamentais.strategy;

// Cliente que utiliza o padrão Strategy
public class Cliente {
    public static void main(String[] args) {
        // Criando estratégias
        Estrategia soma = new Soma();
        Estrategia subtracao = new Subtracao();
        Estrategia multiplicacao = new Multiplicacao();

        // Criando contexto com estratégia de soma
        Contexto contexto = new Contexto(soma);
        contexto.executarOperacao(5, 3);

        // Mudando a estratégia para subtração
        contexto.setEstrategia(subtracao);
        contexto.executarOperacao(5, 3);

        // Mudando a estratégia para multiplicação
        contexto.setEstrategia(multiplicacao);
        contexto.executarOperacao(5, 3);
    }
}

