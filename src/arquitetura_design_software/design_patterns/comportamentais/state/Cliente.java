package arquitetura_design_software.design_patterns.comportamentais.state;

// Cliente que utiliza o padrão State
public class Cliente {
    public static void main(String[] args) {
        // Criando o contexto
        Contexto contexto = new Contexto();

        // Realizando ação no estado inicial
        contexto.realizarAcao();

        // Mudando para o estado intermediário
        contexto.setEstado(new EstadoIntermediario());

        // Realizando ação no estado intermediário
        contexto.realizarAcao();

        // Mudando para o estado final
        contexto.setEstado(new EstadoFinal());

        // Realizando ação no estado final
        contexto.realizarAcao();
    }
}

