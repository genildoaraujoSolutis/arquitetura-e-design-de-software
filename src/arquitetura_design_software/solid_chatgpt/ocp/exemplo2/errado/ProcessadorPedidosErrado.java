package arquitetura_design_software.solid_chatgpt.ocp.exemplo2.errado;

// Classe que processa pedidos
class ProcessadorPedidosErrado {
    public double calcularDesconto(Pedido pedido) {
        double desconto = 0.0;

        // Violando o OCP: Adicionando lógica condicional para diferentes tipos de pedido
        if (pedido.getTipo().equals("VIP")) {
            desconto = pedido.getValor() * 0.2;
        } else if (pedido.getTipo().equals("Normal")) {
            desconto = pedido.getValor() * 0.1;
        }

        return desconto;
    }
}
