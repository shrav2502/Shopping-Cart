package bean;

public class Customer {
private String customerId;
private int accountNum;
private String customerName;
private String password;
private int debitCardNumber;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(String customerId, int accountNum, String customerName, String password, int debitCardNumber) {
	super();
	this.customerId = customerId;
	this.accountNum = accountNum;
	this.customerName = customerName;
	this.password = password;
	this.debitCardNumber = debitCardNumber;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public int getAccountNum() {
	return accountNum;
}
public void setAccountNum(int accountNum) {
	this.accountNum = accountNum;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getDebitCardNumber() {
	return debitCardNumber;
}
public void setDebitCardNumber(int debitCardNumber) {
	this.debitCardNumber = debitCardNumber;
}
@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", accountNum=" + accountNum + ", customerName=" + customerName
			+ ", password=" + password + ", debitCardNumber=" + debitCardNumber + "]";
}


}
