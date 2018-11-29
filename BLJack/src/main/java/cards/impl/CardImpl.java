package cards.impl;

import cards.Card;
import cards.Lear;
import cards.Rank;

/**
 * Created by ruslangramatic on 11/19/18.
 */
public class CardImpl implements Card {
    private Lear lear;
    private Rank rank;

    public Lear getLear() {
        return lear;
    }

    public void setLear(Lear lear) {
        this.lear = lear;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Integer getValue() {
        return rank.getValue();
    }
}
