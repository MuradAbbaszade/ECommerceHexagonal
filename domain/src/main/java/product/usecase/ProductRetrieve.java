package product.usecase;

import common.model.UseCase;
import lombok.Builder;
import lombok.Data;
import product.model.Product;

@Data
@Builder
public class ProductRetrieve implements UseCase {
    private int productId;
    public ProductRetrieve(int productId){
        this.productId=productId;
    }
}
