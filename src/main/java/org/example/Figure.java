package org.example;

public class Figure {
    public static void main(String[] args) {
        Shape circle = new Circle(9, "Розовый", "Голубой");
        Shape rectangle = new Rectangle(9, 12, "Зелёный", "Жёлтый");
        Shape triangle = new Triangle(7, 3, 5, "Чёрный", "Белый");

        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();
    }
}

interface Shape {
    double calculatePerimeter();

    double calculateArea();

    default void printInfo() {
        System.out.println(this);
    }
}

class Circle implements Shape {
    private final double radius;
    private final String fillColor;
    private final String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Круг: Периметр = " + calculatePerimeter() +
                ", Площадь = " + calculateArea() +
                ", Заливка = " + fillColor +
                ", Граница = " + borderColor;
    }
}

class Rectangle implements Shape {
    private final double width;
    private final double height;
    private final String fillColor;
    private final String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public double calculateArea() {
        return width * height;
    }

    public String toString() {
        return "Прямоугольник: Периметр = " + calculatePerimeter() +
                ", Площадь = " + calculateArea() +
                ", Заливка = " + fillColor +
                ", Граница = " + borderColor;
    }
}

class Triangle implements Shape {
    private final double a, b, c;
    private final String fillColor;
    private final String borderColor;

    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double calculatePerimeter() {
        return a + b + c;
    }

    public double calculateArea() {
        double s = calculatePerimeter() / 2; // Полупериметр
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public String toString() {
        return "Треугольник: Периметр = " + calculatePerimeter() +
                ", Площадь = " + calculateArea() +
                ", Заливка = " + fillColor +
                ", Граница = " + borderColor;
    }
}
