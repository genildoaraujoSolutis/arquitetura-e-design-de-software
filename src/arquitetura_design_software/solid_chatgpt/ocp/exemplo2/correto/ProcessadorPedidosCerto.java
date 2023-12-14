package arquitetura_design_software.solid_chatgpt.ocp.exemplo2.correto;

// Classe que processa pedidos usando a interface Desconto
class ProcessadorPedidosCerto {
    private Desconto desconto;

    public ProcessadorPedidosCerto(Desconto desconto) {
        this.desconto = desconto;
    }

    public double calcularDesconto(double valor) {
        return desconto.calcularDesconto(valor);
    }
}
