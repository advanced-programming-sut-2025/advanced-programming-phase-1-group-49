package Models.Enums;

import Models.Shops.Shop;

public enum Shops {
    BlackSmith(new Shop()),
    Carpenter(new Shop()),
    FishShop(new Shop()),
    JojaMart(new Shop()),
    Marnie(new Shop()),
    Pierre(new Shop()),
    StarDrop(new Shop());

    private final Shop shop;

    Shops(Shop shop) {
        this.shop = shop;
    }

    public Shop getShop() {
        return shop;
    }
}
