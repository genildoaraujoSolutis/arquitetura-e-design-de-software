package arquitetura_design_software.design_patterns.comportamentais.chain_of_responsibility;

// Outra implementação concreta do manipulador
class ManipuladorDiretor implements Manipulador {
    @Override
    public void manipularPedido(Pedido pedido) {
        if (pedido.getValor() > 500) {
            System.out.println("Pedido manipulado pelo Diretor: " + pedido);
        } else {
            System.out.println("Pedido encaminhado para o próximo nível.");
        }
    }
}
