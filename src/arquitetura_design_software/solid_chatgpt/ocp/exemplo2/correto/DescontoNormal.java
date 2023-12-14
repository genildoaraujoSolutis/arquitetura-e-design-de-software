package arquitetura_design_software.solid_chatgpt.ocp.exemplo2.correto;

class DescontoNormal implements Desconto {
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.1;
    }
}
