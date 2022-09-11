package product.usecase;

import common.model.UseCase;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductRetrieve implements UseCase {
    private int productId;
}
