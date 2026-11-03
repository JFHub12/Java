public class Main{

    public static void main(String[] args) {
        
        Account account = new Account("jessefiagbe", "MTN", 200000, 1980);

        System.out.println(account.getUsername());
        System.out.println(account.getAccountType());
        System.out.println(account.getBalance());
        System.out.println(account.getPin());
    }
}