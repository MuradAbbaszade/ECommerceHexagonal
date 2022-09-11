package product.port;

import product.model.Product;
import product.usecase.CreateProduct;
import product.usecase.ProductRetrieve;

public interface ProductPort {
    Product createProduct(CreateProduct createProduct);
    Product getProduct(ProductRetrieve productRetrieve);
    void deleteAll();
}
