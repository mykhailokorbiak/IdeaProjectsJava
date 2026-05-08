class ColorTriangle extends Triangle {
    String color;
    String name;
    ColorTriangle(double a, double b, String color, String name) {
        this.a = a;
        this.b = b;
        this.color = color;
        this.name = name;
    }
    void info() {
        System.out.println("Назва: " + name);
        System.out.println("Колір: " + color);
        super.info();
    }
}