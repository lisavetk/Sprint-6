package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private LionDependencyInjection lionDependencyInjection;

    public Lion(String sex, LionDependencyInjection lionDependencyInjection) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
        this.lionDependencyInjection = lionDependencyInjection;
    }

    // ЗАВИСИМОСТЬ (удали потом коммент, Лиза)
    Feline feline = new Feline();

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
