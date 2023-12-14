package arquitetura_design_software.design_patterns.estruturais.facade;

// Cliente que utiliza o padrão Facade
public class Cliente {
    public static void main(String[] args) {
        // Criando a fachada
        Facade facade = new Facade();

        // Chamando a operação através da fachada
        facade.operacaoFacade();
    }
}

