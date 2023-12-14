package arquitetura_design_software.design_patterns.estruturais.adpter;

// Classe que implementa a interface Adaptada (Adaptee)
class ClasseAdaptada implements Adaptada {
    @Override
    public void operacaoAdaptada() {
        System.out.println("Operação da ClasseAdaptada");
    }
}
