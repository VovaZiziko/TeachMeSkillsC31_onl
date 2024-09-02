package Homework8;

public class Rabbit extends Animal{

    @Override
    public void voice() {
        System.out.println("The rabbit doesn't make any sounds ");

    }

    @Override
    public void eat(String food) {
        switch (food){
            case "Grass" :
                System.out.println("I like to eat grass");
                break;
            default:
                System.out.println("I don't eat that");
        }


    }
}
