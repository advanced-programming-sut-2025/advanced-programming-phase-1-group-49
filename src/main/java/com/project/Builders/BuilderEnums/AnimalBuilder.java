package com.project.Builders.BuilderEnums;

import com.project.Models.Enums.BarnTypes;
import com.project.Models.LivingBeings.Animal;
import com.project.Models.LivingBeings.LivingBeings;

public enum AnimalBuilder {
    Chicken(new Animal()
            .setName("Chicken")
            .setBarnAnimal(false)
            .setBarnType(BarnTypes.Regular)
            .setCost(800)
            .addProducts(OrganicProductBuilder.Egg.product)
            .addProducts(OrganicProductBuilder.LargeEgg.product)
            .setCycleDays(1)
            .setCycleHour(9)
    ),

    Duck(new Animal()
            .setName("Duck")
            .setBarnAnimal(false)
            .setBarnType(BarnTypes.Big)
            .setCost(1200)
            .addProducts(OrganicProductBuilder.DuckEgg.product)
            .addProducts(OrganicProductBuilder.LargeDuckEgg.product)
            .setCycleDays(2)
            .setCycleHour(9)
    ),

    Rabbit(new Animal()
            .setName("Rabbit")
            .setBarnAnimal(false)
            .setBarnType(BarnTypes.Deluxe)
            .setCost(8000)
            .addProducts(OrganicProductBuilder.LambWool.product)
            .addProducts(OrganicProductBuilder.RabbitWool.product)
            .setCycleDays(4)
            .setCycleHour(9)
    ),

    Cow(new Animal()
            .setName("Cow")
            .setBarnAnimal(true)
            .setBarnType(BarnTypes.Regular)
            .setCost(1500)
            .addProducts(OrganicProductBuilder.WhiteMilk.product)
            .addProducts(OrganicProductBuilder.LargeWhiteMilk.product)
            .setCycleDays(1)
            .setCycleHour(9)
    ),

    Goat(new Animal()
            .setName("Goat")
            .setBarnAnimal(true)
            .setBarnType(BarnTypes.Big)
            .setCost(4000)
            .addProducts(OrganicProductBuilder.GoatMilk.product)
            .addProducts(OrganicProductBuilder.LargeGoatMilk.product)
            .setCycleDays(2)
            .setCycleHour(9)
    ),

    Sheep(new Animal()
            .setName("Sheep")
            .setBarnAnimal(true)
            .setBarnType(BarnTypes.Deluxe)
            .setCost(8000)
            .addProducts(OrganicProductBuilder.LambWool.product)
            .setCycleDays(3)
            .setCycleHour(9)
    ),

    Pig(new Animal()
            .setName("Pig")
            .setBarnAnimal(true)
            .setBarnType(BarnTypes.Deluxe)
            .setCost(16000)
            .addProducts(OrganicProductBuilder.PigTruffle.product)
            .setCycleDays(3)
            .setCycleHour(9)
    );

    public final LivingBeings animal;

    AnimalBuilder(LivingBeings animal) {
        this.animal = animal;
    }
}
