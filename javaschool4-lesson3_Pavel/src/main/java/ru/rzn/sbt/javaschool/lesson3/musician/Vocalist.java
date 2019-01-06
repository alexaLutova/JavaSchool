package ru.rzn.sbt.javaschool.lesson3.musician;

public class Vocalist extends Musician {
    private int Stroka=0;
    private static String[] Stroki = new String[]{
            "Take me to the magic of the moment",
            "on a glory night",
            "Where the children of tomorrow dream away",
            "In the Wind of Change"

 };

    @Override
    protected String sing(){
        if (Stroka==Stroki.length) {Stroka=0;}
      return Stroki[Stroka++];

    }

    @Override
    protected String playGuitar(){
        return null;
    }
}
