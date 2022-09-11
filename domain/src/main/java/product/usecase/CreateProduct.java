package product.usecase;

import common.model.UseCase;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateProduct implements UseCase {
    private String name;
    private String img;
    private String desc;
    private int categoryId;
    private double price;
}
