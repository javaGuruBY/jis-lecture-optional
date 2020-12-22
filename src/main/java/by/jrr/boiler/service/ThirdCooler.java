package by.jrr.boiler.service;

import by.jrr.boiler.bean.HotWater;
import by.jrr.boiler.bean.Water;

import java.util.Optional;

public class ThirdCooler {
    private Water water;
    private boolean hasPower;

    public void setUp(Water water, boolean hasPower) {
        this.water = water;
        this.hasPower = hasPower;
    }

    public Water getWater() {
        return Optional.ofNullable(water).orElse(new Water());
    }

    public Water getWaterSupplier() {
        return Optional.ofNullable(water).orElseGet(() -> new Water());
    }

    public Water getWaterSupplierOrThrow() {
        return Optional.ofNullable(water).orElseThrow();
    }

    public Water getWaterSupplierOrThrowMyException() {
        return Optional.ofNullable(water).orElseThrow(() -> new IllegalStateException());
    }

    public Optional<HotWater> getHotWater() {
        if (!hasPower) return Optional.empty();
        return Optional.of(getWater().boil());
    }
}
