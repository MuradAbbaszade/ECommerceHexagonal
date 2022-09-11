package payment.usecase;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentCreate {
    private int accountId;
    private int productId;
    private double productPrice;
}
