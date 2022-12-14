package product.usecase;

import category.model.Category;
import common.model.UseCase;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateProduct implements UseCase {
    private String name;
    private String desc;
    private String img;
    private int categoryId;
    private double price;

    public CreateProduct(String name,String desc,String img,int categoryId,double price){
        this.name=name;
        this.desc=desc;
        this.img=img;
        this.categoryId=categoryId;
        this.price=price;
    }
}
