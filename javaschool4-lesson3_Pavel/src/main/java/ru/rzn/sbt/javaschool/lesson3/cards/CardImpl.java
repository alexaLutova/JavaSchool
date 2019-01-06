package ru.rzn.sbt.javaschool.lesson3.cards;

//import org.graalvm.compiler.lir.phases.LIRPhaseSuite;

public class CardImpl implements Card {
    private int suit; //масть карты
    private int rank; //достоинство карты
    enum Suit {
        бубны,
        трефы,
        червы,
        пики}
    enum Rank{
        туз,
        шестёрка,
        семёрка,
        восьмёрка,
        девятка,
        десятка,
        валет,
        дама,
        король}

        public CardImpl(int suit,int rank){
           this.suit=suit;
           this.rank=rank;
        }

        @Override
        public String toString(){
             return Rank.values()[rank].name()+ " " + Suit.values()[suit].name();
    }
}
