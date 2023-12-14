package arquitetura_design_software.design_patterns.estruturais.proxy;

// Cliente que utiliza o padrão Proxy
public class Cliente {
    public static void main(String[] args) {
        // Usando o Proxy para acessar o Objeto Real
        Proxy proxy = new Proxy();
        proxy.operacao();
    }
}

