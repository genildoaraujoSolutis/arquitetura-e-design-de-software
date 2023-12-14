package arquitetura_design_software.solid_chatgpt.dip.errado;

// Classe de baixo nível que lida com armazenamento em um banco de dados
class BancoDeDados {
    public void salvarDado(String dado) {
        System.out.println("Dado salvo no banco de dados: " + dado);
    }
}
