package com.example;

import java.util.List;

import static com.example.AlexLionConstants.*;

public class AlexLion extends Lion {


    public AlexLion(LionDependencyInjection lionDependencyInjection) throws Exception {
        super("Самец", lionDependencyInjection);
    }

    public List<String> getFriends() {
        return LIST_OF_FRIENDS_ALEX;
    }

    public String getPlaceOfLiving() {
        return HOME_ADDRESS_ALEX;
    }

    @Override
    public int getKittens() {
        return ALEX_KITTENS;
    }

}
