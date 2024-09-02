package Homework10;

public class Main {
    public static void main(String[] args) {


        User user1 = new User(112, "VasyaTheBest", "VasyaPupkin");
        User user2 = new User(112, "VasyaTheBest", "VasyaPupkin");
        User user3 = new User(112, "VasyaTheBest", "VasyaPupkin");
        User user4 = new User(112, "VasyaTheBest", "VasyaPupkin");


        System.out.println(user1.equals(user2));
        System.out.println(user1.equals(user3));
        System.out.println(user1.equals(user4));
        System.out.println(user2.equals(user3));
        System.out.println(user2.equals(user4));
        System.out.println(user3.equals(user4));


    }
}
