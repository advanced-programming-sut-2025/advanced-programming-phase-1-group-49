package com.project.Models.Enums;

import com.project.Models.Houses.Shop;

public enum Shops {
    BlackSmith(new Shop(13, 135, 4, 15, 9, 16)),
    Carpenter(new Shop(40, 113, 6, 20, 9, 20)),
    FishShop(new Shop(29, 110, 4, 15, 9, 17)),
    JojaMart(new Shop(50, 125, 5, 10, 9, 21)),
    Marnie(new Shop(35, 130, 5, 19, 9, 16)),
    Pierre(new Shop(30, 87, 6, 13, 9, 17)),
    StarDrop(new Shop(36, 170, 4, 15, 12, 22));

    public final Shop shop;

    Shops(Shop shop) {
        this.shop = shop;
    }

    public Shop getShop() {
        return shop;
    }
}
