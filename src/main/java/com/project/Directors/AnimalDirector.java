package com.project.Directors;

import com.project.Builders.BuilderEnums.AnimalBuilder;
import com.project.Builders.BuilderEnums.FruitTreeBuilder;
import com.project.Models.Enums.Season;
import com.project.Models.Item.Foraging;
import com.project.Models.LivingBeings.Animal;

import java.util.ArrayList;

public class AnimalDirector {
    public static Animal randomAnimal() {
        int i = 0;
        ArrayList<Animal> foragings = new ArrayList<Animal>();
        for (AnimalBuilder animalBuilder : AnimalBuilder.values()) {
            Animal animal = (Animal) animalBuilder.animal;
        }
        int randomFactor = (int) (Math.random() * 1000 % foragings.size());
        return foragings.get(randomFactor);
    }
}
