package AbstractFactory.SingleProducts;

import AbstractFactory.Delivery.CourierService;

public class ExpressDelivery implements CourierService {
    @Override
    public void transfer() {
        System.out.println("Express delivery for single products");
    }
}
