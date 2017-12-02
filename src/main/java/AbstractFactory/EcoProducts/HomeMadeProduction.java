package AbstractFactory.EcoProducts;

import AbstractFactory.Production.Developing;

public class HomeMadeProduction implements Developing{
    @Override
    public void produce() {
        System.out.println("ECO Homemade production");
    }
}
