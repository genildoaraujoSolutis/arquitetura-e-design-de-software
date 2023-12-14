package arquitetura_design_software.design_patterns.criacionais.singleton;

// Cliente que utiliza o padrão Singleton
public class Cliente {
    public static void main(String[] args) {
        // Obtendo a instância única
        Singleton singleton1 = Singleton.getInstancia();
        Singleton singleton2 = Singleton.getInstancia();

        // Verificando se as instâncias são iguais
        if (singleton1 == singleton2) {
            System.out.println("As instâncias são as mesmas.");
        }

        // Usando a instância
        singleton1.exibirMensagem();
        singleton2.exibirMensagem();
    }
}