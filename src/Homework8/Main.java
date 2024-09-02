package Homework8;

public class Main {
    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit();
        Dog dog = new Dog();
        Tiger tiger = new Tiger();

        rabbit.voice();
        dog.voice();
        tiger.voice();

        rabbit.eat("Grass");
        rabbit.eat("Meat");
        dog.eat("Meat");
        dog.eat("Carrot");
        tiger.eat("Meat");
        tiger.eat("Waffles");


    }
}
