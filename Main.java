interface Shape {
    double getArea(); 
    double getPerimeter();
    String getFillColor(); 
    String getBorderColor(); 


    default void printInfo(String shapeName) {
        System.out.printf("%s: [ Периметр: %.2f, Площадь: %.2f, Цвет фона: %s, Цвет границ: %s ]%n",
                shapeName, getPerimeter(), getArea(), getFillColor(), getBorderColor());
    }
}

class Circle implements Shape {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getFillColor() { return fillColor; }

    @Override
    public String getBorderColor() { return borderColor; }
}


class Rectangle implements Shape {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String getFillColor() { return fillColor; }

    @Override
    public String getBorderColor() { return borderColor; }
}


class Triangle implements Shape {
    private double a, b, c;
    private String fillColor;
    private String borderColor;

    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Формула Герона
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String getFillColor() { return fillColor; }

    @Override
    public String getBorderColor() { return borderColor; }
}


public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(7, "Розовый", "Синий");
        Shape rectangle = new Rectangle(5, 14, "Желтый", "Белый");
        Shape triangle = new Triangle(6, 7, 8, "Синий", "Зеленый");

        circle.printInfo("Круг");
        rectangle.printInfo("Прямоугольник");
        triangle.printInfo("Треугольник");
    }
}