package aston.aqa;

public class TriangleAreaCalculator {
    public static double calculateTriangleArea(double base, double height) {
        if (base <= 0 || height <= 0) throw new IllegalArgumentException("Параметры должны быть > 0");
        return 0.5 * base * height;
    }
}