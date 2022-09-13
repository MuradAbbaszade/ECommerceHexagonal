package product.model;

import category.model.Category;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Builder
public class Product {
    private int id;
    private String name;
    private String image;
    private String description;
    private double price;
    private int categoryId;
}
