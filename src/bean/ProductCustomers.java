package bean;

public class ProductCustomers {
private String productId;
private String customerId;
private int debitCardNumber;
private int creditCardNumber;
private double price;
public ProductCustomers() {
	super();
	// TODO Auto-generated constructor stub
}
public ProductCustomers(String productId, String customerId, int debitCardNumber, int creditCardNumber, double price) {
	super();
	this.productId = productId;
	this.customerId = customerId;
	this.debitCardNumber = debitCardNumber;
	this.creditCardNumber = creditCardNumber;
	this.price = price;
}
public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public int getDebitCardNumber() {
	return debitCardNumber;
}
public void setDebitCardNumber(int debitCardNumber) {
	this.debitCardNumber = debitCardNumber;
}
public int getCreditCardNumber() {
	return creditCardNumber;
}
public void setCreditCardNumber(int creditCardNumber) {
	this.creditCardNumber = creditCardNumber;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "ProductCustomers [productId=" + productId + ", customerId=" + customerId + ", debitCardNumber="
			+ debitCardNumber + ", creditCardNumber=" + creditCardNumber + ", price=" + price + "]";
}


}
