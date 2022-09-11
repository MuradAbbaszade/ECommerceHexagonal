package product;

import common.DomainComponent;
import common.usecase.UseCaseHandler;
import common.usecase.VoidEmptyUseCaseHandler;
import product.port.ProductPort;

@DomainComponent
public class ProductAdminUseCaseHandler implements VoidEmptyUseCaseHandler {

    private final ProductPort productPort;

    public ProductAdminUseCaseHandler(ProductPort productPort) {
        this.productPort = productPort;
    }

    @Override
    public void handle() {
        productPort.deleteAll();
    }
}
