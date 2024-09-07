package lesson10;

import java.util.Objects;

public class User {
    private String username;
    private String position;

    public User(String username, String position) {
        this.username = username;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Name - " + username + ", Roles - " + position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, position);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        User user = (User) object;
        return username.equals(user.username) && position.equals(user.position);
    }
}
