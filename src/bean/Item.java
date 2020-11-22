package bean;

public class Item {
private String itemId;
private String itemName;
public Item() {
	super();
	// TODO Auto-generated constructor stub
}
public Item(String itemId, String itemName) {
	super();
	this.itemId = itemId;
	this.itemName = itemName;
}
public String getItemId() {
	return itemId;
}
public void setItemId(String itemId) {
	this.itemId = itemId;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
@Override
public String toString() {
	return "Item [itemId=" + itemId + ", itemName=" + itemName + "]";
}


}
