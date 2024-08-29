import lesson8.Animal;
import lesson8.Dog;
import lesson8.Rabbit;
import lesson8.Tiger;

public class Main {
    public static void main(String[] args) {
        Animal[] Animal = new Animal[]{
                new Dog(),
                new Rabbit(),
                new Tiger()
        };

        for(Animal animal : Animal){
            animal.eat("Meat");
            animal.sound();
            System.out.println();
        }
    }
}