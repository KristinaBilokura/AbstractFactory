package AbstractFactory.FactoryMarketing;


import AbstractFactory.MarketingPackage.Advertising;
import AbstractFactory.MarketingPackage.Media;

public class MediaAdverticingFactory implements MarketingFactory {
    @Override
    public Advertising create() {
        return new Media();
    }
}
