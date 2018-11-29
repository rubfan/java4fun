package table;

import player.Player;

import java.util.List;

/**
 * Created by ruslangramatic on 11/19/18.
 */
public interface Table {
    void addPlayer(Player player);
    List<Player> getPlayers();
    void setBet(Bet bet);
    Bet getBet();
}
