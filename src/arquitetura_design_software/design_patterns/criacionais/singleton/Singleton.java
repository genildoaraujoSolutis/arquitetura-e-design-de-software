package arquitetura_design_software.design_patterns.criacionais.singleton;

// Implementação do Singleton
public class Singleton {
    // A instância única da classe
    private static Singleton instancia;

    // Construtor privado para evitar a criação de instâncias diretamente
    private Singleton() {
        // Inicialização, se necessário
    }

    // Método público para obter a instância única da classe
    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    // Métodos da classe
    public void exibirMensagem() {
        System.out.println("Esta é uma instância Singleton.");
    }
}
