package arquitetura_design_software.design_patterns.comportamentais.mediator;

// Interface Colleague
interface Colleague {
    void receberMensagem(String mensagem);

    void enviarMensagem(String mensagem);
}
