package arquitetura_design_software.design_patterns.comportamentais.chain_of_responsibility;

// Classe que representa um pedido
class Pedido {
    private String descricao;
    private double valor;

    public Pedido(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Pedido [descricao=" + descricao + ", valor=" + valor + "]";
    }
}
