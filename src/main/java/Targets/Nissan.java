package Targets;

import Prototype.Car;

public class Nissan extends Car {
    public double trunk;

    public Nissan() {
    }

    public Nissan(Nissan nissan) {
        super(nissan);
        this.trunk = nissan.trunk;
    }

    @Override
    public Car clone() {
        return new Nissan(this);
    }
}
