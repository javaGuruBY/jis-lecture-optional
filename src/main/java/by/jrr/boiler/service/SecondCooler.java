package by.jrr.boiler.service;

import by.jrr.boiler.bean.HotWater;
import by.jrr.boiler.bean.Water;

import java.util.Optional;

public class SecondCooler {
    private Water water;
    private boolean hasPower;

    public void setUp(Water water, boolean hasPower) {
        this.water = water;
        this.hasPower = hasPower;
    }

    public Optional<Water> getWater() {
        return Optional.ofNullable(water);
    }

    public Optional<HotWater> getHotWater() {
        if (!hasPower) return Optional.empty();
        return getWater().map(water -> water.boil());
    }
}
