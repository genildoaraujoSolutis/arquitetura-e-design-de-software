package arquitetura_design_software.solid_chatgpt.ocp.exemplo2.errado;

// Classe representando um Pedido
class Pedido {
    private String produto;
    private double valor;
    private String tipo;

    public Pedido(String produto, double valor, String tipo) {
        this.produto = produto;
        this.valor = valor;
        this.tipo = tipo;
    }

    public String getProduto() {
        return produto;
    }

    public double getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }
}
