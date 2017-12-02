package AbstractFactory.MarketingPackage.FactoryMarketing;

import AbstractFactory.MarketingPackage.Advertising;
import AbstractFactory.MarketingPackage.PrintingFlyers;

public class PrintingAdverticingFactory implements MarketingFactory {
    @Override
    public Advertising create() {
        return new PrintingFlyers();
    }
}
