package arquitetura_design_software.solid_chatgpt.dip.correto;

// Implementação concreta da interface de armazenamento usando um banco de dados
class BancoDeDadosCorreto implements Armazenamento {
    @Override
    public void salvarDado(String dado) {
        System.out.println("Dado salvo no banco de dados: " + dado);
    }
}
