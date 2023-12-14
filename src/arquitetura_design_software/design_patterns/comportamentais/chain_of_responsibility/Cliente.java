package arquitetura_design_software.design_patterns.comportamentais.chain_of_responsibility;

// Cliente que utiliza o padrão Chain of Responsibility
public class Cliente {
    public static void main(String[] args) {
        // Criando os manipuladores
        Manipulador manipuladorCoc = new ManipuladorCoc();
        Manipulador manipuladorGerente = new ManipuladorGerente();
        Manipulador manipuladorDiretor = new ManipuladorDiretor();

        // Montando a cadeia de responsabilidade
        manipuladorCoc.manipularPedido(new Pedido("Compra de material de escritório", 80));
        manipuladorGerente.manipularPedido(new Pedido("Compra de software", 800));
        manipuladorDiretor.manipularPedido(new Pedido("Compra de equipamentos", 600));
    }
}

