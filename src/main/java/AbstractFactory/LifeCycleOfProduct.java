package AbstractFactory;

import AbstractFactory.Delivery.CourierService;
import AbstractFactory.MarketingPackage.Advertising;
import AbstractFactory.Production.Developing;

public interface LifeCycleOfProduct {
    CourierService createDelivery();
    Developing createProduction();
    Advertising create();
}
