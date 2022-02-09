package antonio.ecommerce;

import java.math.BigDecimal;

public class Order {

    private final String  orderId;
    private final BigDecimal amount;
    private final String email;

    public Order(String orderId, BigDecimal value, String email) {
        this.orderId = orderId;
        this.amount = value;
        this.email = email;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", amount=" + amount +
                ", email='" + email + '\'' +
                '}';
    }
}
