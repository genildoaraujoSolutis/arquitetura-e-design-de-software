package arquitetura_design_software.design_patterns.comportamentais.chain_of_responsibility;

// Outra implementação concreta do manipulador
class ManipuladorGerente implements Manipulador {

    Manipulador manipuladorDiretor = new ManipuladorDiretor();

    @Override
    public void manipularPedido(Pedido pedido) {
        if (pedido.getValor() > 100 && pedido.getValor() <= 500) {
            System.out.println("Pedido manipulado pelo Gerente: " + pedido);
        } else {
            System.out.println("Pedido encaminhado para o próximo nível.");
            manipuladorDiretor.manipularPedido(pedido);
        }
    }
}
