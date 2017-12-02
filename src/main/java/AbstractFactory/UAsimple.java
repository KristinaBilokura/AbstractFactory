package AbstractFactory;

import AbstractFactory.Delivery.CourierService;
import AbstractFactory.MarketingPackage.Advertising;
import AbstractFactory.Production.Developing;
import AbstractFactory.SingleProducts.SinglePLifeCycle;

public class UAsimple {
    public static void main(String[] args) {
        LifeCycleOfProduct lifeCycleUA = new SinglePLifeCycle();
        Developing production = lifeCycleUA.createProduction();
        CourierService cservice = lifeCycleUA.createDelivery();
        Advertising advertising=lifeCycleUA.create();

        System.out.println("Show the whole LifeCycle");
        production.produce();
        cservice.transfer();
        advertising.write();

    }
}
