package Homework8;

public class Tiger extends Animal{

    @Override
    public void voice() {
        System.out.println("The tiger roars");
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
