import java.util.HashMap;
import java.util.Scanner;

class BankAccount{
    private String name,accountNO;
    private int balance;
    //parametrized constructor
    public BankAccount(String accountNO,String name) {
        this.accountNO = accountNO;
        this.name = name;
        this.balance = 0;
    }
    //deposit
    void deposit(int amount){
        this.balance += amount;
    }
    //withdraw
    boolean withdraw(int amount){
        if(balance<amount)return false;
        balance -= amount;
        return true;
    }
    //print balance
    void balance(){
        System.out.println(this.name+" "+this.balance);
    }
}
public class bankApplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        HashMap<String,BankAccount>account = new HashMap<>();
        while(true){
            String input = scn.nextLine();
            String token[] = input.split(" ");
            String command = token[0]; 
            if(command.equals("CREATE")==true){
                BankAccount acc = new BankAccount(token[1], token[2]);
                account.put(token[1], acc);
            }else if(command.equals("DEPOSIT")==true){
                int amount = Integer.parseInt(token[2]);
                BankAccount acc= account.get(token[1]);
                acc.deposit(amount);
            }else if(command.equals("WITHDRAW")==true){
                int amount = Integer.parseInt(token[2]);
                BankAccount acc = account.get(token[1]);
                acc.withdraw(amount);
            }else if(command.equals("BALANCE")==true){
                BankAccount acc = account.get(token[1]);
                acc.balance();
            }else{
                return;
            }
        }
    }
}
