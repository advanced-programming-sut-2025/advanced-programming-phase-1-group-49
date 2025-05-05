package com.project.Models.Enums;

import com.project.Models.LivingBeings.Animal;
import com.project.Models.LivingBeings.Bird;
import com.project.Models.LivingBeings.Mammal;

public enum Animals {
    Chicken(new Bird()),
    Cow(new Mammal()),
    Duck(new Bird()),
    Goat(new Mammal()),
    Pig(new Mammal()),
    Rabbit(new Mammal()),
    Sheep(new Mammal()),
    Dinosaur(new Bird());


    private final Animal animal;

    Animals(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }
}
