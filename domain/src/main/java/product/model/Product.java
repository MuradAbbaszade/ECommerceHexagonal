package product.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    private int id;
    private String name;
    private String img;
    private String desc;
    private double price;
    private int categoryId;
}
