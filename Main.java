public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso
        Circulo circulo = new Circulo("Círculo", 4.0);
        Rectangulo rectangulo = new Rectangulo("Rectángulo", 9.0, 5.0);
        Triangulo triangulo = new Triangulo("Triángulo", 4.0, 9.0);

        System.out.println(circulo.nombre + ": Área = " + circulo.calcularArea());
        System.out.println(rectangulo.nombre + ": Área = " + rectangulo.calcularArea());
        System.out.println(triangulo.nombre + ": Área = " + triangulo.calcularArea());
    }
}

