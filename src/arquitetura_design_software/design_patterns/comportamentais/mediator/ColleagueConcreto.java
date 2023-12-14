package arquitetura_design_software.design_patterns.comportamentais.mediator;

// Implementação concreta de Colleague
class ColleagueConcreto implements Colleague {
    private Mediator mediator;
    private String nome;

    public ColleagueConcreto(Mediator mediator, String nome) {
        this.mediator = mediator;
        this.nome = nome;
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println(nome + " recebeu a mensagem: " + mensagem);
    }

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println(nome + " enviou a mensagem: " + mensagem);
        mediator.enviarMensagem(mensagem, this);
    }
}
