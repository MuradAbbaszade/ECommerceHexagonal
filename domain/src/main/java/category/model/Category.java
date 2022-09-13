package category.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import product.model.Product;

import java.util.List;

@Data
@Builder
public class Category {
    private int id;
    private String name;
    private List<Product> productList;
}
