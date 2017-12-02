package AbstractFactory.EcoProducts;

import AbstractFactory.Delivery.CourierService;

public class InterNationalDelivery implements CourierService {
    @Override
    public void transfer() {
        System.out.println("ECO Do international delivery");
    }
}
