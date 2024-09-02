package Homework8;

public class Dog extends Animal{

    @Override
    public void voice() {
        System.out.println("The dog growls and barks");

    }

    @Override
    public void eat(String food) {
        switch (food) {
            case "Meat":
                System.out.println("I like to eat meat");
                break;
            default:
                System.out.println("I don't eat that");
        }

    }
}
