package arquitetura_design_software.design_patterns.estruturais.proxy;

// Proxy - Atua como um substituto ou placeholder para o objeto real
class Proxy implements ObjetoReal {
    private ObjetoRealConcreto objetoReal;

    @Override
    public void operacao() {
        // Cria o objeto real apenas quando necessário
        if (objetoReal == null) {
            objetoReal = new ObjetoRealConcreto();
        }

        // Pode realizar operações adicionais antes ou depois de chamar o objeto real
        System.out.println("Operação do Proxy antes da chamada ao Objeto Real");

        // Chama o método no objeto real
        objetoReal.operacao();

        // Pode realizar operações adicionais após a chamada ao objeto real
        System.out.println("Operação do Proxy após a chamada ao Objeto Real");
    }
}
