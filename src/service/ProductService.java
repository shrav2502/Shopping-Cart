package service;
import java.util.List;

import bean.Product;
import dao.ProductDao;

public class ProductService {
ProductDao pd;

public ProductService() {
	pd=new ProductDao();
}

public List<Product> retrieveAllProduct(){
	return pd.retrieveAllProduct();
}
}
