import lesson10.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Pale", "Developer1");
        User user2 = new User("Pale", "Developer2");
        User user3 = new User("Pale", "Developer1");

        System.out.println("user1.equals(user2) " + user1.equals(user2));
        System.out.println("user1.equals(user3) " + user1.equals(user3));
    }
}
