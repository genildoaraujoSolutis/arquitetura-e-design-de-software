package arquitetura_design_software.design_patterns.criacionais.prototype;

// Implementação concreta do Prototype
class Produto implements CloneableProduto {
    private String descricao;

    public Produto(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public CloneableProduto clonar() {
        return new Produto(this.descricao);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Descrição do Produto: " + descricao);
    }
}
