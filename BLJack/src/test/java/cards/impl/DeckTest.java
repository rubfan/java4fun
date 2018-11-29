package cards.impl;

import cards.Card;
import cards.Deck;
import org.junit.Assert;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ruslangramatic on 11/22/18.
 */
public class DeckTest {
    private Deck deck;

    @Before
    public void init() {
        deck = new DeckImpl();
    }

    @Test
    public void shuffleCardsTest() {
        int count1 = 0;
        int factor1 = 1;
        for (Card card : deck.getCards()) {
            count1 += card.getValue() * factor1;
            factor1++;
        }
        deck.shuffleCards();
        int count2 = 0;
        int factor2 = 1;
        for (Card card : deck.getCards()) {
            count2 += card.getValue() * factor2;
            factor2++;
        }
        assertThat(count1, is(not(count2)));
    }

    @Test
    public void getCardsTest() {
        int sum = 81 * 4;
        int count = 0;
        for (Card card : deck.getCards()) {
            count += card.getValue();
        }
        assertThat(count, is(sum));
        assertThat(deck.getCards().size(), is(36));
    }
}
