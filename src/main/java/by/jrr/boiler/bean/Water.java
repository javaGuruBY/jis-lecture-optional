package by.jrr.boiler.bean;

public class Water {
    static {
        System.out.println("new Water!");
    }

    public HotWater boil() {
        return new HotWater();
    }
}
