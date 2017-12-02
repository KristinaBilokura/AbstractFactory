package AbstractFactory.SingleProducts;

import AbstractFactory.Production.Developing;

public class PlantsProduction implements Developing {
    @Override
    public void produce() {
        System.out.println("Single products production at plant");
    }
}
