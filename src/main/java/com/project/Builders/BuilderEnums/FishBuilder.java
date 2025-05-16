package com.project.Builders.BuilderEnums;

import com.project.Models.Enums.FPLevel;
import com.project.Models.LivingBeings.Fish;
import com.project.Models.LivingBeings.LivingBeings;

public enum FishBuilder {
    Salmon(new Fish()
            .setName("Salmon")
            .setFall(true)
            .setSellPrice(75)
            .setLevel(1)
    ),
    Sardine(new Fish()
            .setName("Sardine")
            .setSpring(true)
            .setSellPrice(40)
            .setLevel(1)
    ),
    Shad(new Fish()
            .setName("Shad")
            .setSpring(true)
            .setSellPrice(60)
            .setLevel(1)
    ),
    BlueDiscus(new Fish()
            .setName("BlueDiscus")
            .setSpring(true)
            .setSellPrice(120)
            .setLevel(2)
    ),
    MidnightCarp(new Fish()
            .setName("MidnightCarp")
            .setWinter(true)
            .setSellPrice(150)
            .setLevel(2)
    ),
    Squid(new Fish()
            .setName("Squid")
            .setWinter(true)
            .setSellPrice(80)
            .setLevel(1)
    ),
    Tuna(new Fish()
            .setName("Tuna")
            .setWinter(true)
            .setSellPrice(100)
            .setLevel(1)
    ),
    Perch(new Fish()
            .setName("Perch")
            .setWinter(true)
            .setSellPrice(55)
            .setLevel(1)
    ),
    Flounder(new Fish()
            .setName("Flounder")
            .setSummer(true)
            .setSellPrice(100)
            .setLevel(2)
    ),
    Lionfish(new Fish()
            .setName("Lionfish")
            .setSummer(true)
            .setSellPrice(100)
            .setLevel(2)
    ),
    Herring(new Fish()
            .setName("Herring")
            .setSummer(true)
            .setSellPrice(30)
            .setLevel(1)
    ),
    Ghostfish(new Fish()
            .setName("Ghostfish")
            .setSummer(true)
            .setSellPrice(45)
            .setLevel(1)
    ),
    Tilapia(new Fish()
            .setName("Tilapia")
            .setSpring(true)
            .setSellPrice(75)
            .setLevel(2)
    ),
    Dorado(new Fish()
            .setName("Dorado")
            .setSpring(true)
            .setSellPrice(100)
            .setLevel(2)
    ),

    Sunfish(new Fish()
            .setName("Sunfish")
            .setSpring(true)
            .setSellPrice(30)
            .setLevel(1)
    ),
    RainbowTrout(new Fish()
            .setName("RainbowTrout")
            .setSpring(true)
            .setSellPrice(65)
            .setLevel(1)
    ),

    // Legendary
    Legend(new Fish()
            .setName("Legend")
            .setSummer(true)
            .setSellPrice(5000)
            .setLevel(4)
    ),
    Glacierfish(new Fish()
            .setName("Glacierfish")
            .setWinter(true)
            .setSellPrice(1000)
            .setLevel(4)
    ),
    Angler(new Fish()
            .setName("Angler")
            .setSpring(true)
            .setSellPrice(900)
            .setLevel(4)
    ),
    Crimsonfish(new Fish()
            .setName("Crimsonfish")
            .setSpring(true)
            .setSellPrice(1500)
            .setLevel(4)
    ),
    ;

    public final LivingBeings fish;

    FishBuilder(LivingBeings fish) {
        this.fish = fish;
    }
}
