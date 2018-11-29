package cards.impl;

import cards.Card;
import cards.Lear;
import cards.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
//import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by ruslangramatic on 11/19/18.
 */
public class CardTest {
    private Card card;

    @Before
    public void init() {
        card = new CardImpl();
    }

    @Test
    public void getLearTest() {
        card.setLear(Lear.CLUB);
        Lear l = card.getLear();
        assertThat(l, is(Lear.CLUB));
    }

    @Test
    public void setLearTest() {
        Lear lear = Lear.HEART;
        card.setLear(lear);
        assertThat(card.getLear(), is(Lear.HEART));
    }

    @Test
    public void getRankTest() {

    }

    @Test
    public void setRankTest() {
        Rank lear;
    }

    @Test
    public void getValueTest() {

    }

    @Test
    public void setValueTest() {
        Integer lear;
    }
}
