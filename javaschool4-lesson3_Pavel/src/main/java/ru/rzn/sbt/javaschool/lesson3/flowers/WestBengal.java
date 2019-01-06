package ru.rzn.sbt.javaschool.lesson3.flowers;

public class WestBengal implements Region {
    @Override
    public Jasmine yourNationalFlower(){
        return new Jasmine();
    }
}
