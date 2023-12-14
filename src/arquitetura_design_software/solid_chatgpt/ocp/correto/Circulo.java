package arquitetura_design_software.solid_chatgpt.ocp.correto;

class Circulo implements Shape {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
