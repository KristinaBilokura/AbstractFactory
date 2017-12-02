package AbstractFactory.MarketingPackage;

import AbstractFactory.MarketingPackage.FactoryMarketing.BBAdverticingFactory;
import AbstractFactory.MarketingPackage.FactoryMarketing.MarketingFactory;
import AbstractFactory.MarketingPackage.FactoryMarketing.MediaAdverticingFactory;
import AbstractFactory.MarketingPackage.FactoryMarketing.PrintingAdverticingFactory;

public class Marketing {
    public static void main(String[] args) throws Exception {
        MarketingFactory marketingFactory = putType("media");
        Advertising advertising = marketingFactory.create();
        advertising.write();
    }
    static MarketingFactory putType(String type) throws Exception {
        if(type.equalsIgnoreCase("media")){
            return  new MediaAdverticingFactory();
        }else if(type.equalsIgnoreCase("flyers")){
            return new PrintingAdverticingFactory();
        }else if(type.equalsIgnoreCase("bigboard")){
            return new BBAdverticingFactory();
        }else{
            throw new Exception();
        }
    }
}
