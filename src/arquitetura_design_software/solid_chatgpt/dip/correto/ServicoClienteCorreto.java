package arquitetura_design_software.solid_chatgpt.dip.correto;

// Classe de alto nível que depende de abstrações, não de implementações concretas
class ServicoClienteCorreto {
    private Armazenamento armazenamento;

    public ServicoClienteCorreto(Armazenamento armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void processarDado(String dado) {
        // Utiliza a abstração, não a implementação concreta
        armazenamento.salvarDado(dado);
    }
}
