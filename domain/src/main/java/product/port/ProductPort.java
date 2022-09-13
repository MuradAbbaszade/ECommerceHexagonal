package product.port;

import product.model.Product;
import product.usecase.CreateProduct;

public interface ProductPort {
    Product createProduct(CreateProduct createProduct) throws Exception;
    Product getProductById(int id) throws Exception;
    void deleteAll();
}
