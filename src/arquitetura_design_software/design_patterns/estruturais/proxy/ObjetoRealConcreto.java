package arquitetura_design_software.design_patterns.estruturais.proxy;

// Implementação concreta do objeto real
class ObjetoRealConcreto implements ObjetoReal {
    @Override
    public void operacao() {
        System.out.println("Operação do Objeto Real Concreto");
    }
}
