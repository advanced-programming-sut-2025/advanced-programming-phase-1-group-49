package Models.Enums;

import Models.Animal.Animal;
import Models.Animal.Bird;
import Models.Animal.Mammal;

public enum Animals {
    Chicken(new Bird()),
    Cow(new Mammal()),
    Duck(new Bird()),
    Goat(new Mammal()),
    Pig(new Mammal()),
    Rabbit(new Mammal()),
    Sheep(new Mammal());

    private final Animal animal;

    Animals(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }
}
