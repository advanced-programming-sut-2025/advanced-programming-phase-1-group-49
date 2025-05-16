package com.project.Directors;

import com.project.Builders.ArtisanBuilder;
import com.project.Models.Item.Artisan;

import java.util.ArrayList;
import java.util.Arrays;

public class ArtisanDirector {
    public Artisan buildHoney() {
        return (Artisan) new ArtisanBuilder()
                .setName("Honey")
                .setEnergy(75)
                .setSellPrice(350)
                .setRecipe(null)
                .build();
    }

    public Artisan buildMead() {
        return (Artisan) new ArtisanBuilder().build();
    }

    public Artisan buildCheese() {
        return (Artisan) new ArtisanBuilder().build();
    }

    public Artisan buildLargeCheese() {
        return (Artisan) new ArtisanBuilder().build();
    }

    public Artisan buildGoatCheese() {
        return (Artisan) new ArtisanBuilder().build();
    }

    public Artisan buildLargeGoatCheese() {
        return (Artisan) new ArtisanBuilder().build();
    }

    public Artisan buildMayonnaise() {
        return (Artisan) new ArtisanBuilder().build();
    }

    public Artisan buildLargeMayonnaise() {
        return (Artisan) new ArtisanBuilder().build();
    }

    public Artisan buildDuckMayonnaise() {
        return (Artisan) new ArtisanBuilder().build();
    }

    public Artisan buildDinoMayonnaise() {
        return (Artisan) new ArtisanBuilder().build();
    }

    public Artisan buildBeer() {
        return (Artisan) new ArtisanBuilder().build();
    }

    public Artisan buildPaleAle() {
        return (Artisan) new ArtisanBuilder().build();
    }

    public Artisan buildWine(String fruitName, int basePrice, int baseEnergy) {
        return (Artisan) new ArtisanBuilder().build();
    }

    public Artisan buildJuice(String vegetableName, int basePrice, int baseEnergy) {
        return (Artisan) new ArtisanBuilder().build();
    }

    public Artisan buildVinegar() {
        return (Artisan) new ArtisanBuilder().build();
    }

    public Artisan buildCoffee() {
        return (Artisan) new ArtisanBuilder().build();
    }

    public Artisan buildTruffleOil() {
        return (Artisan) new ArtisanBuilder().build();
    }

    public Artisan buildCloth() {
        return (Artisan) new ArtisanBuilder().build();
    }
}
