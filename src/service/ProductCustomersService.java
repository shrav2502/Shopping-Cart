package service;

import dao.ProductCustomersDao;

public class ProductCustomersService {
ProductCustomersDao pcd;

public ProductCustomersService() {
	pcd=new ProductCustomersDao();
}
public void addOrderDetails() {
	
}

public void removeProductFromList(String pid) {
	pcd.deleteProduct(pid);
}

public void removeAllProducts(String iid) {
	pcd.deleteAllProducts(iid);
}
}
