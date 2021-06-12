package Targets;

import Prototype.Car;

public class Ferrari extends Car {
    public int wheelRadius;

    public Ferrari(){

    }
    public Ferrari(Ferrari target){
        super(target);
        if (target != null){
            this.wheelRadius = target.wheelRadius;
        }
    }

    @Override
    public Car clone() {
        return new Ferrari(this);
    }
}
