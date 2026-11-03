public class Account{

    String username;
    String account_type;
    private float balance;
    private int pin;

    Account(String username, String account_type, float balance, int pin){
        this.username = username;
        this.account_type = account_type;
        this.balance = balance;
        this.pin = pin;
    }

    String getUsername(){
        return this.username;
    }

    String getAccountType(){
        return this.account_type;
    }

    float getBalance(){
        return this.balance;
    }

    int getPin(){
        return this.pin;
    }
}