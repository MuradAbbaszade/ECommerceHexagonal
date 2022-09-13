package product.port;

import product.model.Product;
import product.usecase.CreateProduct;

public interface ProductPort {
    Product createProduct(CreateProduct createProduct);
    Product getProductById(int id);
    void deleteAll();
}
