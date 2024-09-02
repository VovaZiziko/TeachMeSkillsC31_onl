package Homework6;

public class CreditCard {
    private long accountNumber;
    private long accountBalance;



    public CreditCard(long accountNumber, long accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public CreditCard(){};


    public void getFromAccountBalance(long sum) {
        this.accountBalance -= sum;
        System.out.println("С вашего счета было снято " + sum + ", баланс составляет " + accountBalance);

    }

    public void addToAccountBalance(long sum) {
        this.accountBalance += sum;
        System.out.println("Ваш счет был пополнен на " + sum + ", баланс сосавляет " + accountBalance);

    }
    public void getInfo(){
        System.out.println("CreditCard{" +
                "accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                '}');
    }
}
