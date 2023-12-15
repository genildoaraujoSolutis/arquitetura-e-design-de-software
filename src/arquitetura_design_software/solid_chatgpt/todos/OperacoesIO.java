package arquitetura_design_software.solid_chatgpt.todos;

//Interface Segregation Principle (ISP): A interface OperacoesIO é segregada em métodos específicos
// para leitura e escrita, evitando que as classes que a implementam sejam forçadas a
// implementar métodos desnecessários.

// Interface para operações de leitura e escrita
interface OperacoesIO {
    String ler();

    void escrever(String conteudo);
}
