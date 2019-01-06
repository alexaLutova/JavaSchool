package ru.rzn.sbt.javaschool.lesson3.cards;

public class DeckImpl implements Deck {
    private CardImpl[][] cards;
    public DeckImpl(){
        cards=new CardImpl[CardImpl.Suit.values().length][CardImpl.Rank.values().length];
        for (int i=0;i< CardImpl.Suit.values().length;i++){
            for (int j=0;j<CardImpl.Rank.values().length;j++){
                cards[i][j]=new CardImpl(i,j);
            }
        }
    }

    @Override
    public Card getCard(int suit, int rank) {
        return cards[suit][rank];
    }
}
