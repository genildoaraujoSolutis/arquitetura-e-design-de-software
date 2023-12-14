package arquitetura_design_software.design_patterns.estruturais.bridge;

// Cliente que utiliza o padrão Bridge
public class Cliente {
    public static void main(String[] args) {
        // Criando diferentes implementações
        Implementacao implementacaoA = new ImplementacaoA();
        Implementacao implementacaoB = new ImplementacaoB();

        // Criando abstrações refinadas associadas às diferentes implementações
        Abstracao abstracaoA = new AbstracaoRefinada(implementacaoA);
        Abstracao abstracaoB = new AbstracaoRefinada(implementacaoB);

        // Chamando operações abstratas
        abstracaoA.operacaoAbstrata();
        abstracaoB.operacaoAbstrata();
    }
}

