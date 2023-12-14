package arquitetura_design_software.solid_chatgpt.dip.correto;

public class Cliente {
    public static void main(String[] args) {
        // Jeito Certo (DIP)
        Armazenamento bancoDeDados = new BancoDeDadosCorreto();
        ServicoClienteCorreto servicoCliente = new ServicoClienteCorreto(bancoDeDados);
        servicoCliente.processarDado("Dados do cliente");
    }
}


