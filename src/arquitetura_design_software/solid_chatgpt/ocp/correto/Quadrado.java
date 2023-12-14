package arquitetura_design_software.solid_chatgpt.ocp.correto;

// Implementações concretas da interface Shape
class Quadrado implements Shape {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
