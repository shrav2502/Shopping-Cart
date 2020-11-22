package bean;

public class Address {
private String addressId;
private String streetName;
private String city;
private String state;
private int pin;
private String customerId;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(String addressId, String streetName, String city, String state, int pin, String customerId) {
	super();
	this.addressId = addressId;
	this.streetName = streetName;
	this.city = city;
	this.state = state;
	this.pin = pin;
	this.customerId = customerId;
}
public String getAddressId() {
	return addressId;
}
public void setAddressId(String addressId) {
	this.addressId = addressId;
}
public String getStreetName() {
	return streetName;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
@Override
public String toString() {
	return "Address [addressId=" + addressId + ", streetName=" + streetName + ", city=" + city + ", state=" + state
			+ ", pin=" + pin + ", customerId=" + customerId + "]";
}


}
