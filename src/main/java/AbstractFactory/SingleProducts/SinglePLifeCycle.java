package AbstractFactory.SingleProducts;

import AbstractFactory.Delivery.CourierService;
import AbstractFactory.LifeCycleOfProduct;
import AbstractFactory.MarketingPackage.Advertising;
import AbstractFactory.Production.Developing;

public class SinglePLifeCycle implements LifeCycleOfProduct {
    @Override
    public CourierService createDelivery() {
        return new ExpressDelivery();
    }

    @Override
    public Developing createProduction() {
        return new PlantsProduction();
    }

    @Override
    public Advertising create() {
        return new BigBoardMarketing();
    }
}
