package table;

/**
 * Created by ruslangramatic on 11/19/18.
 */
public interface Bet {
    void addMoney(Integer money);
    Integer getCurrentBet();
    Integer takeBet();
}
