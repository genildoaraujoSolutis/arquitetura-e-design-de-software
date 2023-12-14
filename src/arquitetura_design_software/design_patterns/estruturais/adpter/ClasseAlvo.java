package arquitetura_design_software.design_patterns.estruturais.adpter;

// Classe que implementa a interface alvo (Target)
class ClasseAlvo implements Alvo {
    @Override
    public void operacao() {
        System.out.println("Operação da ClasseAlvo");
    }
}
