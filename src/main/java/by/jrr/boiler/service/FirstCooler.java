package by.jrr.boiler.service;

import by.jrr.boiler.bean.HotWater;
import by.jrr.boiler.bean.Water;

import java.util.Optional;

public class FirstCooler {
    private boolean hasWater;
    private boolean hasPower;

    public Optional<Water> getWater() {
        return hasWater ?  Optional.of(new Water()) : Optional.empty();
    }

    public Optional<HotWater> getHotWater() {
        if (!hasWater) return Optional.empty();
        return getWater().map(water -> water.boil());
    }
}
