package Homework13;

public class Main {
    public static void main(String[] args) {
        try {
            Authorization.authorize("thrhnnuy", "ty5ythttjj", "ty5ythttjj");
            System.exit(0);
        }catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }catch (WrongLoginException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }finally {
            System.out.println("Никогда не выполнится"); // Task2
        }

    }

}
