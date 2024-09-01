package lesson9Task2;

public class Circle extends Figure{

    private double a;

    public Circle(double a){
        this.a = a;
    }

    @Override
    public double square() {
        return 3.14 * (a * a);
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * a;
    }
}
