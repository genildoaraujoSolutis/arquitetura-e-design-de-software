package arquitetura_design_software.design_patterns.estruturais.composite;

// Leaf (folha) - Implementação concreta do componente
class Folha implements Componente {
    private String nome;

    public Folha(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibirNome() {
        System.out.println("Folha: " + nome);
    }
}
