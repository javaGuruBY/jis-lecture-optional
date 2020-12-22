package by.jrr.boiler.service;

import by.jrr.boiler.bean.Water;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.ThrowableAssert.catchThrowable;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ThirdCoolerTest {

    ThirdCooler thirdCooler;

    @BeforeEach
    public void setUp() {
        thirdCooler = new ThirdCooler();
    }

    @Test
    void getWater_positive() {
        thirdCooler.setUp(new Water(), true);
        thirdCooler.getWater();
    }

    @Test
    void getWater_negative() {
        thirdCooler.setUp(null, true);
        thirdCooler.getWater();
    }

    @Test
    void getWaterSupplier_positive() {
        thirdCooler.setUp(new Water(), true);
        thirdCooler.getWaterSupplier();
    }

    @Test
    void getWaterSupplier_negative() {
        thirdCooler.setUp(null, true);
        thirdCooler.getWaterSupplier();
    }

    @Test
    void getWaterSupplierOrThrow() {
        thirdCooler.setUp(null, true);
        thirdCooler.getWaterSupplier();

        Throwable throwable = catchThrowable( () -> thirdCooler.getWaterSupplierOrThrow());
        boolean result = throwable instanceof NoSuchElementException;
        assertTrue(result);
    }

    @Test
    void getWaterSupplierOrThrowMyException() {
        thirdCooler.setUp(null, true);

        Throwable throwable = catchThrowable( () -> thirdCooler.getWaterSupplierOrThrowMyException());

        boolean result = throwable instanceof IllegalStateException;
        assertTrue(result);
    }


}
