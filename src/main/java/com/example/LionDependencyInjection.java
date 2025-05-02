package com.example;

import java.util.List;

public interface LionDependencyInjection {
    int getKittens();
    List<String> getFood(String animalKind) throws Exception;
}
