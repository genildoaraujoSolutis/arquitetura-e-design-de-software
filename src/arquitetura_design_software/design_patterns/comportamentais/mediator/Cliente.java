package arquitetura_design_software.design_patterns.comportamentais.mediator;

// Cliente que utiliza o padrão Mediator
public class Cliente {
    public static void main(String[] args) {
        // Criando um Mediator
        MediatorConcreto mediator = new MediatorConcreto();

        // Criando Colleagues e associando-os ao Mediator
        ColleagueConcreto colega1 = new ColleagueConcreto(mediator, "Colega 1");
        ColleagueConcreto colega2 = new ColleagueConcreto(mediator, "Colega 2");
        ColleagueConcreto colega3 = new ColleagueConcreto(mediator, "Colega 3");

        mediator.adicionarColleague(colega1);
        mediator.adicionarColleague(colega2);
        mediator.adicionarColleague(colega3);

        // Enviando mensagens entre Colleagues usando o Mediator
        colega1.enviarMensagem("Olá a todos!");
        colega2.enviarMensagem("Oi a todos!");
    }
}

