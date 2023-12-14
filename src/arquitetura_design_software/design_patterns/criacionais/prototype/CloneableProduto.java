package arquitetura_design_software.design_patterns.criacionais.prototype;

public interface CloneableProduto extends Cloneable {
    CloneableProduto clonar();
    void exibirInfo();
}
