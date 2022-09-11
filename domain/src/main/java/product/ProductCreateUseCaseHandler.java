package product;

import account.port.AccountPort;
import common.DomainComponent;
import common.usecase.UseCaseHandler;
import common.usecase.VoidEmptyUseCaseHandler;
import lombok.extern.slf4j.Slf4j;
import product.model.Product;
import product.port.ProductPort;
import product.usecase.CreateProduct;

@DomainComponent
public class ProductCreateUseCaseHandler implements UseCaseHandler<Product,CreateProduct> {

    private final ProductPort productPort;

    public ProductCreateUseCaseHandler(ProductPort productPort) {
        this.productPort = productPort;
    }

    @Override
    public Product handle(CreateProduct createProduct) {
        return productPort.createProduct(createProduct);
    }
}
