package Client;

import Prototype.Type;
import Targets.BMV;

public class Demo {
    public static void main(String[] args) {

        BMV bmv = new BMV();
        bmv.type = Type.COMPARTMENT;
        bmv.color = "green";
        bmv.engine = "V8";
        bmv.grille = "Ноздри";

        BMV chineseBMV = (BMV) bmv.clone();
        //chineseBMV.color = "blue";

        System.out.println("Цвет оригинального BMV: " + bmv.color);
        System.out.println("Цвет китайского BMV:  " + chineseBMV.color);
    }

}
