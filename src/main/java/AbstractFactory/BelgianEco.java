package AbstractFactory;

import AbstractFactory.Delivery.CourierService;
import AbstractFactory.EcoProducts.EcoLifeCycle;
import AbstractFactory.MarketingPackage.Advertising;
import AbstractFactory.Production.Developing;

public class BelgianEco {
    public static void main(String[] args) {
        LifeCycleOfProduct lifeCycle = new EcoLifeCycle();
        Developing developer = lifeCycle.createProduction();
        CourierService cservice = lifeCycle.createDelivery();
        Advertising advertising=lifeCycle.create();

        System.out.println("Show the whole LifeCycle");
        developer.produce();
        cservice.transfer();
        advertising.write();
    }
}
