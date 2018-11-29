package cards.impl;

import cards.Card;
import cards.Deck;
import cards.Lear;
import cards.Rank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * Created by ruslangramatic on 11/22/18.
 */
public class DeckImpl implements Deck {
    public int MAX_CARDS = 36;
    private static List<Card> cards = null;
    private int currentCard;


    public Integer getCardsNumber() {
        return cards.size();
    }

    public void shuffleCards() {
        int numberOfShuffles = (int) (Math.random() * 1000);
        for (int i = 0; i < numberOfShuffles; i++) {
            int from = (int) (Math.random() * (MAX_CARDS - 1));
            int to = (int) (Math.random() * (MAX_CARDS - 1));
            Card cardFrom = getCards().get(from);
            Card cardTo = getCards().get(to);
            getCards().set(from, cardTo);
            getCards().set(to, cardFrom);
        }
        currentCard = MAX_CARDS;
    }

    public Card getTopCard() {
        return getCards().get(--currentCard);
    }

    public List<Card> getHandCards() {
        return Arrays.asList(getTopCard(),getTopCard());
    }

    public List<Card> getCards() {
        if (cards == null) {
            cards = new ArrayList<>(36);
            fillDeck(cards);
            currentCard = MAX_CARDS;
        }
        return cards;
    }

    private void fillDeck(List<Card> cards) {
        Set<Lear> lears = EnumSet.allOf(Lear.class);
        Set<Rank> ranks = EnumSet.allOf(Rank.class);
        lears.forEach(lear ->
            ranks.forEach(rank ->
                cards.add(new CardImpl() {{
                    setLear(lear);
                    setRank(rank);
                }})
            )
        );
    }
}
