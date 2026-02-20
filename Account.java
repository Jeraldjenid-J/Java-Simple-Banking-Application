public abstract class Account {
    String name;
    String ssn;
    double balance;
    String accountNumber;
    double rate;

    public Account(String name,String ssn,double initDeposit){
        this.name=name;
        this.ssn=ssn;
        this.balance=initDeposit;

        this.accountNumber=setAccountNumber();
    }

    private String setAccountNumber(){
        String lastTwoOfSSN=ssn.substring(ssn.length()-2);
        int uniqueID=(int) (Math.random() * Math.pow(10,5));
        return lastTwoOfSSN +uniqueID;
    }

    public void showInfo(){
        System.out.println("Name: " + name +
                "\nAccount Number: " + accountNumber +
                "\nBalance: $" + balance);
    }
}
