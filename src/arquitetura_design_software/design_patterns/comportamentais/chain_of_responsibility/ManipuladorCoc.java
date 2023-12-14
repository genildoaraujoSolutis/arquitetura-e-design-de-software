package arquitetura_design_software.design_patterns.comportamentais.chain_of_responsibility;

// Implementação concreta do manipulador
class ManipuladorCoc implements Manipulador {
    @Override
    public void manipularPedido(Pedido pedido) {
        if (pedido.getValor() <= 100) {
            System.out.println("Pedido manipulado pelo CoC (Comitê de Compras): " + pedido);
        } else {
            System.out.println("Pedido encaminhado para o próximo nível.");
        }
    }
}
