import lesson9Task1.Accountant;
import lesson9Task1.Director;
import lesson9Task1.Emploees;
import lesson9Task1.Employee;
import lesson9Task2.Circle;
import lesson9Task2.Figure;
import lesson9Task2.Rectangle;
import lesson9Task2.Triangle;

public class Main {
    public static void main(String[] args) {
        Emploees[] emploees = new Emploees[]{
                new Employee(),
                new Director(),
                new Accountant()
        };
        for (Emploees emloee : emploees) {
            System.out.println(emloee.workingPositions());
        }
        System.out.println("--------------------------------------");

        Figure[] figures = new Figure[]{
                new Triangle(8, 5, 4),
                new Rectangle(5, 8),
                new Circle(9),
                new Triangle(3, 4, 6),
                new Rectangle(4, 7)
        };
        for (Figure figure : figures) {
            System.out.println("area of the figure = " + figure.perimeter());
        }
        System.out.println();

        double sum = 0;
        for (int i = 0; i < figures.length; i++) {
            sum += figures[i].perimeter();
        }
        System.out.println("Area of all figures = " + sum);
    }
}