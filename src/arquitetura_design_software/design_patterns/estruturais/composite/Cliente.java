package arquitetura_design_software.design_patterns.estruturais.composite;

// Cliente que utiliza o padrão Composite
public class Cliente {
    public static void main(String[] args) {
        // Criando folhas
        Folha folha1 = new Folha("Folha 1");
        Folha folha2 = new Folha("Folha 2");
        Folha folha3 = new Folha("Folha 3");

        // Criando compostos
        Composto composto1 = new Composto("Composto 1");
        composto1.adicionar(folha1);
        composto1.adicionar(folha2);

        Composto composto2 = new Composto("Composto 2");
        composto2.adicionar(folha3);

        Composto compostoPrincipal = new Composto("Composto Principal");
        compostoPrincipal.adicionar(composto1);
        compostoPrincipal.adicionar(composto2);

        // Exibindo os nomes usando o padrão Composite
        compostoPrincipal.exibirNome();
//        composto1.exibirNome();
    }
}

