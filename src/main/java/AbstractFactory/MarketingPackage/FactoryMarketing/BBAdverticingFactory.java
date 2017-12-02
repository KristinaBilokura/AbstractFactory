package AbstractFactory.MarketingPackage.FactoryMarketing;


import AbstractFactory.MarketingPackage.Advertising;
import AbstractFactory.MarketingPackage.BigBoard;



public class BBAdverticingFactory implements MarketingFactory {
    @Override
    public Advertising create() {
        return new BigBoard();
    }
}
