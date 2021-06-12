package Targets;

import Prototype.Car;

public class BMV extends Car {
    public String grille;

    public BMV() {
    }

    public BMV(BMV target) {
        super(target);
        this.grille = target.grille;
    }

    @Override
    public Car clone() {
        return new BMV(this);
    }

}
