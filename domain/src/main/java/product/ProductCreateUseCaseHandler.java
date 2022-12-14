package product;


import common.usecase.UseCaseHandler;
import lombok.RequiredArgsConstructor;
import product.model.Product;
import product.port.ProductPort;
import product.usecase.CreateProduct;

@RequiredArgsConstructor
public class ProductCreateUseCaseHandler implements UseCaseHandler<Product,CreateProduct> {

    private final ProductPort productPort;

    @Override
    public Product handle(CreateProduct createProduct) throws Exception {
        return productPort.createProduct(createProduct);
    }
}
