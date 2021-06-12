package Prototype;

public abstract class Car {
    public String engine;
    public String color;
    public Type type;

    public Car() {
    }

    //конструктор прототипа
    public Car(Car target) {
        if (target != null){
            this.engine = target.engine;
            this.color = target.color;
            this.type = target.type;
        }
    }

    public abstract Car clone();

}
