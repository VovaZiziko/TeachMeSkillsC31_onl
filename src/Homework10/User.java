package Homework10;

import java.util.Objects;

public class User {

    private int id;
    private String password;
    private String login;

    public User(int id, String password, String login) {
        this.id = id;
        this.password = password;
        this.login = login;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(password, user.password) && Objects.equals(login, user.login);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", login='" + login + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, password, login);




    }
}
