package oops;
//Abstract classes are primarily created for inheritance
// SavingsAccount is a Account  or kind of Account/ (inheritance relationship)
public class AbstractClassEx {
    public static void main(String[] args) {
//        reference
       Accountt account = null;
//       'Accountt' is abstract; cannot be instantiated
//       account = new Accountt();
//        upcasting > referring to a child class by a parent class
        account = new SavingsAccountt();
        account.deposit();
        account.withdraw();
        account.getBalance();
        account.transfer();
//      Cannot resolve method 'openFD' in 'Accountt'
//        account.openFD();
        // downcasting > referring to a child class from parent class
        SavingsAccountt savingsAccountt = null;
        savingsAccountt = (SavingsAccountt) account;
        savingsAccountt.openFD();
//apply the same for Digital Wallet
    }
}

abstract class Accountt {
//    abstract methods do not have a body
    public abstract void withdraw();
    public abstract void deposit();
    public abstract void transfer();
//    concrete methods
    public void getBalance() {
        System.out.println("diplay balaance");
    }

}

class  SavingsAccountt extends Accountt {
    @Override
    public void withdraw() {
        System.out.println("withdraw cash from bank");
    }

    @Override
    public void deposit() {
        System.out.println("deposit cash in bank");
    }

    @Override
    public void transfer() {
        System.out.println("transfer amount by going to the bank");
    }
    public void openFD(){
        System.out.println("open fixed deposit in bank");
    }
}
class DigitalWallett extends Accountt {

    @Override
    public void withdraw() {
        System.out.println("withdraw cash from the wallet");
    }

    @Override
    public void deposit() {
        System.out.println("add cash to wallet by transferring amount from bank account");
    }

    @Override
    public void transfer() {
        System.out.println("transfer account to and from bank accounts");
    }
    public void billPayments(){
        System.out.println("pay bills");
    }
}