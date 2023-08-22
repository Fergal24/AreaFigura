// Clase base FiguraGeometrica
class FiguraGeometrica {
    protected String nombre; // Atributo nombre

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    // Método calcularArea (se marcará como abstracto para forzar su implementación en las clases derivadas)
    public double calcularArea() {
        return 0.0; // Valor predeterminado, se debe sobrescribir en las clases derivadas
    }
}

// Clase derivada Circulo
class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    // Sobrescribe el método calcularArea para calcular el área de un círculo
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

// Clase derivada Rectangulo
class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    // Sobrescribe el método calcularArea para calcular el área de un rectángulo
    @Override
    public double calcularArea() {
        return base * altura;
    }
}

// Clase derivada Triangulo
class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    // Sobrescribe el método calcularArea para calcular el área de un triángulo
    @Override
    public double calcularArea() {
        return (base * altura) / 2.0;
    }
}






