package arquitetura_design_software.solid_chatgpt.ocp.exemplo2.correto;

public class Cliente {
    public static void main(String[] args) {
        // Jeito Certo (OCP)
        Desconto descontoVIP = new DescontoVIP();
        ProcessadorPedidosCerto processadorCerto = new ProcessadorPedidosCerto(descontoVIP);
        double descontoPedidoVIP = processadorCerto.calcularDesconto(100.0);
        System.out.println("Desconto Pedido VIP: " + descontoPedidoVIP);

        // Adicionando um novo tipo de desconto sem modificar ProcessadorPedidosCerto
        Desconto descontoSilver = valor -> valor * 0.15;
        ProcessadorPedidosCerto processadorSilver = new ProcessadorPedidosCerto(descontoSilver);
        double descontoPedidoSilver = processadorSilver.calcularDesconto(100.0);
        System.out.println("Desconto Pedido Silver: " + descontoPedidoSilver);
    }
}
