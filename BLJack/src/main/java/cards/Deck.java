package cards;

import java.util.List;

/**
 * Created by ruslangramatic on 11/19/18.
 */
public interface Deck {
    Integer getCardsNumber();
    void shuffleCards();
    Card getTopCard();
    List<Card> getHandCards();
    public List<Card> getCards();
}
