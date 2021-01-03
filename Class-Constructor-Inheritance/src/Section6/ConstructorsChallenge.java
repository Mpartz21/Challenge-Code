package Section6;
/*
Create a new class for a bank account
Create fields for the account number, balance, customer name, email and phone number.
Create getters and setters for each field
Create two additional methods
1. To allow the customer to deposit funds (this should increment the balance field).
2. To allow the customer to withdraw funds. This should deduct from the balance field,
but not allow the withdrawal to complete if their are insufficient funds.
You will want to create various code in the Main class (the one created by IntelliJ) to
confirm your code is working.
Add some System.out.println's in the two methods above as well.
 */


/*
part2
Create a new class VipCustomer
it should have 3 fields name, credit limit, and email address.
create 3 constructors
1st constructor empty should call the constructor with 3 parameters with default values
2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
3rd constructor should save all fields.
create getters only for this using code generation of intellij as setters wont be needed
test and confirm it works.
 */
public class ConstructorsChallenge {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void deposit(double depositAmount){
        this.balance =+ depositAmount;
        System.out.println("Balance: " + balance);

    }

    public void withdrawl(double withdrawlAmount){
        if(balance - withdrawlAmount < 0 ){
            System.out.println("Insufficaint funds");
            return;
        }
        this.balance =- withdrawlAmount;
        System.out.println("Balance: " + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {

    }
}

class VipCustomer{
    private String fieldsName;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(String fieldsName,double creditLimit,String emailAddress){
        this.fieldsName = fieldsName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public VipCustomer() {
        this("Default name", 50000.00, "default@email.com");
    }

}
