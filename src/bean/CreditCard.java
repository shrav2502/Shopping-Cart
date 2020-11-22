package bean;

public class CreditCard {
private int creditCardNumber;
private int accountNumber;
private String customerId;
private String password;
private double amount;
public CreditCard() {
	super();
	// TODO Auto-generated constructor stub
}
public CreditCard(int creditCardNumber, int accountNumber, String customerId, String password, double amount) {
	super();
	this.creditCardNumber = creditCardNumber;
	this.accountNumber = accountNumber;
	this.customerId = customerId;
	this.password = password;
	this.amount = amount;
}
public int getCreditCardNumber() {
	return creditCardNumber;
}
public void setCreditCardNumber(int creditCardNumber) {
	this.creditCardNumber = creditCardNumber;
}
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "CreditCard [creditCardNumber=" + creditCardNumber + ", accountNumber=" + accountNumber + ", customerId="
			+ customerId + ", password=" + password + ", amount=" + amount + "]";
}


}
