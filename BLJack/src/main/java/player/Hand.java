package player;

import cards.Card;

import java.util.List;

/**
 * Created by ruslangramatic on 11/19/18.
 */
public interface Hand {
    List<Card> getCards();
    void putCard(Card card);
    void putCards(List<Card> cards);
}
