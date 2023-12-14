package arquitetura_design_software.design_patterns.criacionais.prototype;

// Cliente que utiliza o padrão Prototype
public class Cliente {
    public static void main(String[] args) {
        // Cria um protótipo de produto
        CloneableProduto prototipo = new Produto("Produto Original");

        // Cria cópias do protótipo
        CloneableProduto copia1 = prototipo.clonar();
        CloneableProduto copia2 = prototipo.clonar();

        // Exibe as informações dos produtos
        System.out.println("Original:");
        prototipo.exibirInfo();

        System.out.println("Cópia 1:");
        copia1.exibirInfo();

        System.out.println("Cópia 2:");
        copia2.exibirInfo();
    }
}
