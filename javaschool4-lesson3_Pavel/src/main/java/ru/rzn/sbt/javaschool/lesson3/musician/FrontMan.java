package ru.rzn.sbt.javaschool.lesson3.musician;

public class FrontMan extends Musician {
    private int Stroka = 0;
    private static String[] Stroki = new String[]{
            "Take advantage while",
            "You hang me out to dry",
            "But I can't see you every night",
            "Free I do"

    };

    private final String[] Accord = new String[]{
                     "C# G# F#",
                     "C# G# F#",
                     "Em E A5 C",
                     "Em G Em G"};
    private int strAccord = 0;

    @Override
    protected String sing() {
        if (Stroka == Stroki.length) {
            Stroka = 0;
        }
        return Stroki[Stroka++];

    }

    @Override
    protected String playGuitar() {
        if (strAccord == Accord.length) {
            strAccord = 0;
        }
        return Accord[strAccord++];

    }
}