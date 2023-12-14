package arquitetura_design_software.solid_chatgpt.ocp.exemplo2.correto;

// Implementações concretas da interface Desconto
class DescontoVIP implements Desconto {
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.2;
    }
}
