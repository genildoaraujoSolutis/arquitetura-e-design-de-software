package arquitetura_design_software.design_patterns.comportamentais.observer;

// Cliente que utiliza o padrão Observer
public class Cliente {
    public static void main(String[] args) {
        // Criando observadores
        ObservadorConcreto observador1 = new ObservadorConcreto("Observador 1");
        ObservadorConcreto observador2 = new ObservadorConcreto("Observador 2");

        // Criando sujeito
        SujeitoConcreto sujeito = new SujeitoConcreto();

        // Adicionando observadores ao sujeito
        sujeito.adicionarObservador(observador1);
        sujeito.adicionarObservador(observador2);

        // Realizando uma ação que notificará os observadores
        sujeito.realizarAcao();

        // Removendo um observador
        sujeito.removerObservador(observador1);

        // Realizando outra ação após remover um observador
        sujeito.realizarAcao();
    }
}

