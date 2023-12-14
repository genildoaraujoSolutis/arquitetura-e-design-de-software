package arquitetura_design_software.design_patterns.comportamentais.command;

// Cliente que utiliza o padrão Command
public class Cliente {
    public static void main(String[] args) {
        // Criando objetos
        Luz luz = new Luz();
        ControleRemoto controleRemoto = new ControleRemoto();

        // Criando comandos
        ComandoLigar comandoLigar = new ComandoLigar(luz);
        ComandoDesligar comandoDesligar = new ComandoDesligar(luz);

        // Configurando o controle remoto
        controleRemoto.setComando(comandoLigar);

        // Pressionando o botão do controle remoto (executa o comandoLigar)
        controleRemoto.pressionarBotao();

        // Configurando o controle remoto com outro comando
        controleRemoto.setComando(comandoDesligar);

        // Pressionando o botão novamente (executa o comandoDesligar)
        controleRemoto.pressionarBotao();
    }
}

