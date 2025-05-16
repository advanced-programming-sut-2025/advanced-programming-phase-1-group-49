package com.project.Builders.BuilderEnums;

import com.project.Models.Item.Edible;
import com.project.Models.Item.Item;

public enum OrganicProductBuilder {
    Egg(new Edible()
            .setSellPrice(50)
            .setEdible(false)
            .setName("Egg")
    ),
    LargeEgg(new Edible()
            .setSellPrice(95)
            .setEdible(false)
            .setName("LargeEgg")
    ),
    DuckEgg(new Edible()
            .setSellPrice(95)
            .setEdible(false)
            .setName("DuckEgg")
    ),
    LargeDuckEgg(new Edible()
            .setSellPrice(250)
            .setEdible(false)
            .setName("LargeDuckEgg")
    ),
    WhiteMilk(new Edible()
            .setSellPrice(125)
            .setEdible(false)
            .setName("WhiteMilk")
    ),
    LargeWhiteMilk(new Edible()
            .setSellPrice(190)
            .setEdible(false)
            .setName("LargeWhiteMilk")
    ),
    GoatMilk(new Edible()
            .setSellPrice(225)
            .setEdible(false)
            .setName("GoatMilk")
    ),
    LargeGoatMilk(new Edible()
            .setSellPrice(345)
            .setEdible(false)
            .setName("LargeGoatMilk")
    ),
    LambWool(new Edible()
            .setSellPrice(340)
            .setEdible(false)
            .setName("Wool")
    ),
    RabbitWool(new Edible()
            .setSellPrice(565)
            .setEdible(false)
            .setName("RabbitWool")
    ),
    PigTruffle(new Edible()
            .setSellPrice(625)
            .setEdible(false)
            .setName("Truffle")
    );

    public final Item product;

    OrganicProductBuilder(Item product) {
        this.product = product;
    }
}
