package lesson9Task2;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double perimeter() {
        return this.a + this.b + this.c;
    }

    @Override
    public double square() {
        return (perimeter() * (perimeter() - a) * (perimeter() - b) * perimeter() - c) * 0.5;
    }
}
