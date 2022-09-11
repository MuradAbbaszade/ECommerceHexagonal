package payment.port;

import payment.model.Payment;
import payment.usecase.PaymentCreate;

public interface PaymentPort {
    Payment createPayment(PaymentCreate paymentCreate);
}
