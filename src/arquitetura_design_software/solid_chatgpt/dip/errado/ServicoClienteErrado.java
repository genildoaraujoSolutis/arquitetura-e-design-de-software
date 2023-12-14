package arquitetura_design_software.solid_chatgpt.dip.errado;

// Classe de alto nível que depende diretamente da implementação do banco de dados
class ServicoClienteErrado {
    private BancoDeDados bancoDeDados;

    public ServicoClienteErrado() {
        this.bancoDeDados = new BancoDeDados();
    }

    public void processarDado(String dado) {
        // Violando o DIP: Depende diretamente da implementação de baixo nível
        bancoDeDados.salvarDado(dado);
    }
}
