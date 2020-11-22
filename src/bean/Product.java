package bean;

public class Product {
private String productId;
private String productName;
private String itemId;
private double price;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(String productId, String productName, String itemId, double price) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.itemId = itemId;
	this.price = price;
}
public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getItemId() {
	return itemId;
}
public void setItemId(String itemId) {
	this.itemId = itemId;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", itemId=" + itemId + ", price="
			+ price + "]";
}


}
