package player;

/**
 * Created by ruslangramatic on 11/19/18.
 */
public interface Player {
    Hand getHand();
    void setName(String name);
    String getName();
    Wallet getWallet();
}
