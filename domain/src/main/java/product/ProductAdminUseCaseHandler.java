package product;

import common.DomainComponent;
import common.usecase.VoidEmptyUseCaseHandler;
import lombok.RequiredArgsConstructor;
import product.port.ProductPort;

@DomainComponent
@RequiredArgsConstructor
public class ProductAdminUseCaseHandler implements VoidEmptyUseCaseHandler {

    private final ProductPort productPort;

    @Override
    public void handle() {
        productPort.deleteAll();
    }
}
