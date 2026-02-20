public class Checking extends Account implements IRateBase {
    private int debitCardNumber;
    private int debitCardPin;

    public Checking(String name,String ssn,double initDeposit){
        super(name,ssn,initDeposit);
        accountNumber="2" + accountNumber;
        setDebitCard();
    }

    public void setRate(){
        rate=getBaseRate() * 0.15;
    }

    private void setDebitCard(){
        debitCardNumber=(int) (Math.random() * Math.pow(10,12));
        debitCardPin=(int) (Math.random() * Math.pow(10,4));
    }

    public void showInfo(){
        System.out.println("Account Type: Checking Account" );
        super.showInfo();
        System.out.println("Your Checking Account Features: " +
                "\nDebit Card Number: " + debitCardNumber +
                "\nDebit Card Pin: " + debitCardPin);
    }

}
