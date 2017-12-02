package AbstractFactory.SingleProducts;

import AbstractFactory.MarketingPackage.Advertising;

public class BigBoardMarketing implements Advertising {
    @Override
    public void write() {
        System.out.println("BB advertising for single products");
    }
}
