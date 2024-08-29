package lesson8;

public class Tiger extends Animal {

    @Override
    public void sound() {
        System.out.println("Tigers roar");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("Tigers eat " + food);
        } else {
            System.out.println("Tigers don't eat " + food);
        }
    }
}
