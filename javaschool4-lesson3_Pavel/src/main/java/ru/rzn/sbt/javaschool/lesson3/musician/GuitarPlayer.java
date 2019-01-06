package ru.rzn.sbt.javaschool.lesson3.musician;

public class GuitarPlayer extends Musician {
    private final String[] Accord=new String[]{
            "C G Dm G",
            "C G",
            "Dm G Am",
            "Am/F G"};
    private int strAccord=0;
    @Override
    protected String sing(){
        return null;
    }

    @Override
    protected String playGuitar(){
        if (strAccord==Accord.length) {strAccord=0;}
        return Accord[strAccord++];

    }
}

