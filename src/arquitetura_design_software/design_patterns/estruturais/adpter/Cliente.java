package arquitetura_design_software.design_patterns.estruturais.adpter;

// Cliente que utiliza o padrão Adapter
public class Cliente {
    public static void main(String[] args) {
        // Usando a interface Alvo diretamente
        Alvo alvo = new ClasseAlvo();
        alvo.operacao();

        // Usando a interface Adaptada diretamente
        Adaptada adaptada = new ClasseAdaptada();
        adaptada.operacaoAdaptada();

        // Usando o Adapter para adaptar a interface Adaptada para a interface Alvo
        Alvo adaptador = new Adaptador(new ClasseAdaptada());
        adaptador.operacao();
    }
}

