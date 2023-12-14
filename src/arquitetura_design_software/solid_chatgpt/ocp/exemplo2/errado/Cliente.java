package arquitetura_design_software.solid_chatgpt.ocp.exemplo2.errado;

public class Cliente {
    public static void main(String[] args) {
        ProcessadorPedidosErrado processadorPedidosErrado = new ProcessadorPedidosErrado();
        double desconto = processadorPedidosErrado.calcularDesconto(new Pedido("produto1", 10.0, "Normal"));
        System.out.println("desconto: " + desconto);
    }
}
