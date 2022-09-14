package payment.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Payment {
    private int id;
    private double productPrice;
    private int productId;
    private int accountId;
}
