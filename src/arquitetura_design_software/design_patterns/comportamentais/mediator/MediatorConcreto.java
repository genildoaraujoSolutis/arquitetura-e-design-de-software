package arquitetura_design_software.design_patterns.comportamentais.mediator;

import java.util.ArrayList;
import java.util.List;

// Implementação concreta de Mediator
class MediatorConcreto implements Mediator {
    private List<Colleague> colleagues = new ArrayList<>();

    public void adicionarColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void enviarMensagem(String mensagem, Colleague colleague) {
        for (Colleague c : colleagues) {
            if (c != colleague) {
                c.receberMensagem(mensagem);
            }
        }
    }
}
