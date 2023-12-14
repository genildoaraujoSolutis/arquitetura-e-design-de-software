package arquitetura_design_software.solid_chatgpt.ocp.correto;

// Cliente que utiliza o código de forma extensível
public class Cliente {
    public static void main(String[] args) {
        CalculadoraArea calculadora = new CalculadoraArea();

        // Calculando área de um quadrado
        Shape quadrado = new Quadrado(5);
        System.out.println("Área do quadrado: " + calculadora.calcularArea(quadrado));

        // Calculando área de um círculo
        Shape circulo = new Circulo(3);
        System.out.println("Área do círculo: " + calculadora.calcularArea(circulo));
    }
}

