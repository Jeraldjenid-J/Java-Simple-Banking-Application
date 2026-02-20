public class Savings extends Account implements IRateBase{
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    public Savings(String name,String ssn,double initDeposit){
        super(name,ssn,initDeposit);
        accountNumber="1" + accountNumber;
        setSafetyDepositBox();
    }

    public void setRate(){
        rate=getBaseRate() -0.25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID=(int) (Math.random() * Math.pow(10,3));
        safetyDepositBoxKey=(int) (Math.random() * Math.pow(10,4));
    }

    public void showInfo(){
        System.out.println("Account Type: Savings Account ");
        super.showInfo();
        System.out.println("Your Savings Account Features " +
                "\nSafety Deposit Box ID: " + safetyDepositBoxID +
                "\n Safety Deposit Box Key: " + safetyDepositBoxKey);
    }
}
