package arquitetura_design_software.design_patterns.comportamentais.observer;

// Interface Sujeito (Subject)
interface Sujeito {
    void adicionarObservador(Observador observador);

    void removerObservador(Observador observador);

    void notificarObservadores(String mensagem);
}
