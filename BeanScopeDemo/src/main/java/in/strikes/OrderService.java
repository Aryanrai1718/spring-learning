package in.strikes;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

    public OrderService() {
        System.out.println("OrderServiceCreated");
    }

    public void placeOrder() {
        System.out.println("Order Placed");
    }
}
