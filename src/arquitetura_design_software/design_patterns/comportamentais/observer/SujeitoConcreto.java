package arquitetura_design_software.design_patterns.comportamentais.observer;

import java.util.ArrayList;
import java.util.List;

// Implementação concreta de Sujeito
class SujeitoConcreto implements Sujeito {
    private List<Observador> observadores = new ArrayList<>();

    @Override
    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores(String mensagem) {
        for (Observador observador : observadores) {
            observador.atualizar(mensagem);
        }
    }

    // Método que representa uma mudança de estado
    public void realizarAcao() {
        // Realizando alguma ação que notificará os observadores
        System.out.println("Realizando ação no SujeitoConcreto");
        notificarObservadores("Ação realizada no SujeitoConcreto");
    }
}
