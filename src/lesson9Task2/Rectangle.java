package lesson9Task2;

public class Rectangle extends Figure{
    private double a;
    private double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double square() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return (a + a) + (b + b);
    }
}
