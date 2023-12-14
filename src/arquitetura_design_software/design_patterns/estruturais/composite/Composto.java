package arquitetura_design_software.design_patterns.estruturais.composite;

import java.util.ArrayList;
import java.util.List;

// Composite (composto) - Implementação concreta do componente que pode conter folhas e outros compostos
class Composto implements Componente {
    private List<Componente> componentes = new ArrayList<>();
    private String nome;

    public Composto(String nome) {
        this.nome = nome;
    }

    public void adicionar(Componente componente) {
        componentes.add(componente);
    }

    public void remover(Componente componente) {
        componentes.remove(componente);
    }

    @Override
    public void exibirNome() {
        System.out.println("Composto: " + nome);

        for (Componente componente : componentes) {
            componente.exibirNome();
        }
    }
}
