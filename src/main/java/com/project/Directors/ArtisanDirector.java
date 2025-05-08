package com.project.Directors;

import com.project.Builders.ArtisanBuilder;
import com.project.Models.Item.Artisan;

import java.util.ArrayList;
import java.util.Arrays;

public class ArtisanDirector {
    ArtisanDirector() {
    }

    public Artisan buildHoney() {
        return (Artisan) new ArtisanBuilder("honey",
                "It's a sweet syrup produced by bees.",
                75,
                4 * 13,
                350).build();
    }

    public Artisan buildMead() {
        return (Artisan) new ArtisanBuilder("mead",
                "A fermented beverage made from honey. Drink in moderation.",
                100,
                10,
                300,
                new ArrayList<>(Arrays.asList("honey"))).build();
    }

    public Artisan buildCheese() {
        return (Artisan) new ArtisanBuilder("cheese",
                "It's your Basic cheese.",
                100,
                3,
                230,
                new ArrayList<>(Arrays.asList("milk"))).build();
    }

    public Artisan buildLargeCheese() {
        return (Artisan) new ArtisanBuilder("large cheese",
                "It's your Basic cheese made from large milk.",
                100,
                3,
                345,
                new ArrayList<>(Arrays.asList("large milk"))).build();
    }

    public Artisan buildGoatCheese() {
        return (Artisan) new ArtisanBuilder("goat cheese",
                "Soft cheese made from goat's milk.",
                100,
                3,
                400,
                new ArrayList<>(Arrays.asList("goat milk"))).build();
    }

    public Artisan buildLargeGoatCheese() {
        return (Artisan) new ArtisanBuilder("large goat cheese",
                "Soft cheese made from large goat's milk.",
                100,
                3,
                600,
                new ArrayList<>(Arrays.asList("large goat milk"))).build();
    }

    public Artisan buildMayonnaise() {
        return (Artisan) new ArtisanBuilder("mayonnaise",
                "It looks spreadable.",
                50,
                3,
                190,
                new ArrayList<>(Arrays.asList("egg"))).build();
    }

    public Artisan buildLargeMayonnaise() {
        return (Artisan) new ArtisanBuilder("large mayonnaise",
                "It looks spreadable, made from a large egg.",
                50,
                3,
                237,
                new ArrayList<>(Arrays.asList("large egg"))).build();
    }

    public Artisan buildDuckMayonnaise() {
        return (Artisan) new ArtisanBuilder("duck mayonnaise",
                "It's a rich, yellow mayonnaise.",
                75,
                3,
                375,
                new ArrayList<>(Arrays.asList("duck egg"))).build();
    }

    public Artisan buildDinoMayonnaise() {
        return (Artisan) new ArtisanBuilder("dinosaur mayonnaise",
                "It's thick and creamy, with a vivid green hue. It smells like grass and leather.",
                125,
                3,
                800,
                new ArrayList<>(Arrays.asList("dinosaur egg"))).build();
    }

    public Artisan buildBeer() {
        return (Artisan) new ArtisanBuilder("beer",
                "Drink in moderation.",
                50,
                13,
                200,
                new ArrayList<>(Arrays.asList("wheat"))).build();
    }

    public Artisan buildPaleAle() {
        return (Artisan) new ArtisanBuilder("pale ale",
                "Drink in moderation.",
                50,
                3 * 13,
                300,
                new ArrayList<>(Arrays.asList("hops"))).build();
    }

    public Artisan buildWine(String fruitName, int basePrice, int baseEnergy) {
        return (Artisan) new ArtisanBuilder("wine",
                "Drink in moderation.",
                (int) (1.75 * baseEnergy),
                7 * 13,
                3 * basePrice,
                new ArrayList<>(Arrays.asList(fruitName))).build();
    }

    public Artisan buildJuice(String vegetableName, int basePrice, int baseEnergy) {
        return (Artisan) new ArtisanBuilder("juice",
                "A sweet, nutritious beverage.",
                2 * baseEnergy,
                4 * 13,
                (int) (2.25 * basePrice),
                new ArrayList<>(Arrays.asList(vegetableName))).build();
    }

    public Artisan buildVinegar() {
        return (Artisan) new ArtisanBuilder("vinegar",
                "An aged fermented liquid used in many cooking recipes.",
                13,
                10,
                100,
                new ArrayList<>(Arrays.asList("rice"))).build();
    }

    public Artisan buildCoffee() {
        return (Artisan) new ArtisanBuilder("coffee",
                "It smells delicious. This is sure to give you a boost.",
                75,
                2,
                150,
                new ArrayList<>(Arrays.asList("coffee bean (5)"))).build();
    }

    public Artisan buildTruffleOil() {
        return (Artisan) new ArtisanBuilder("truffle oil",
                "A gourmet cooking ingredient.",
                38,
                6,
                1065,
                new ArrayList<>(Arrays.asList("truffle"))).build();
    }

    public Artisan buildCloth() {
        return (Artisan) new ArtisanBuilder("cloth",
                "A bolt of fine wool cloth. Inedible.",
                0,
                4,
                470,
                new ArrayList<>(Arrays.asList("wool"))).build();
    }
}
