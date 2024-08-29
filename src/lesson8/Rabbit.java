package lesson8;

public class Rabbit extends Animal {

    @Override
    public void sound() {
        System.out.println("Rabbits purr");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Grass")) {
            System.out.println("Rabbits eat " + food);
        } else {
            System.out.println("Rabbits don't eat " + food);
        }
    }
}
