package Homework6;

public class Main {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard(12345678910L, 333444555L);
        CreditCard card2 = new CreditCard(10987654321L, 666777888L);
        CreditCard card3 = new CreditCard(96978543235L, 777444111L);



        card1.addToAccountBalance(100000000L);
        card2.addToAccountBalance(200000000L);
        card3.getFromAccountBalance(100000000L);

        card1.getInfo();
        card2.getInfo();
        card3.getInfo();


    }
}
