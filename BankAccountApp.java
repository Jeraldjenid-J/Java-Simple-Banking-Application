import java.util.Scanner;
import java.util.ArrayList;

public class BankAccountApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();

        System.out.println("--- WELCOME TO BANKING SYSTEM ---");

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter SSN: ");
        String ssn = sc.nextLine();

        System.out.print("Choose Account Type (1-Savings, 2-Checking): ");
        int type = sc.nextInt();

        if(type == 1) {
            accounts.add(new Savings(name, ssn, 1000));
        } else {
            accounts.add(new Checking(name, ssn, 1500));
        }

        for(Account acc: accounts){
            System.out.println("\n*****************");
            acc.showInfo();
        }
    }
}