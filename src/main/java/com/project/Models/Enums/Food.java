package Models.Enums;

import java.util.ArrayList;

public enum Food {
    ;
    private final int energy;

    Food(int energy) {
        this.energy = energy;
    }

    private static final ArrayList<String> ingredients = new ArrayList<>();

    public int getEnergy() {
        return energy;
    }
}
