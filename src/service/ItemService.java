package service;

import bean.Item;
import dao.ItemDao;

import java.util.List;

public class ItemService {
ItemDao id;

public ItemService() {
	id=new ItemDao();
}
public List<Item> retrieveAllProduct(){
	return id.retrieveAllItem();
}

}
