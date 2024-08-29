package lesson8;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dogs bark");
    }
    @Override
    public void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("Dogs eat " + food);
        } else {
            System.out.println("Dogs don't eat " + food);
        }
    }
}
