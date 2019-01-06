package ru.rzn.sbt.javaschool.lesson3.flowers;

public class Hungary implements Region {
    @Override
    public Tulip yourNationalFlower(){
        return new Tulip();
    }
}
