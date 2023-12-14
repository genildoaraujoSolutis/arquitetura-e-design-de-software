package arquitetura_design_software.solid_chatgpt.ocp.correto;

// Classe que utiliza a interface Shape
class CalculadoraArea {
    public double calcularArea(Shape shape) {
        return shape.calcularArea();
    }
}
