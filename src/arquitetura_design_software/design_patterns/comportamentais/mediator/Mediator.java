package arquitetura_design_software.design_patterns.comportamentais.mediator;

// Interface Mediator
interface Mediator {
    void enviarMensagem(String mensagem, Colleague colleague);
}
