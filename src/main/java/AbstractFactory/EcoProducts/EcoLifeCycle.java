package AbstractFactory.EcoProducts;

import AbstractFactory.Delivery.CourierService;
import AbstractFactory.LifeCycleOfProduct;
import AbstractFactory.MarketingPackage.Advertising;
import AbstractFactory.Production.Developing;

public class EcoLifeCycle implements LifeCycleOfProduct {
    @Override
    public CourierService createDelivery() {
        return new InterNationalDelivery();
    }

    @Override
    public Developing createProduction() {
        return new HomeMadeProduction();
    }

    @Override
    public Advertising create() {
        return new MediaMarketing();
    }
}
