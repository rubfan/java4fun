package player;

/**
 * Created by ruslangramatic on 11/19/18.
 */
public interface Wallet {
    void setMoney(Integer money);
    Integer getMoney();
    Boolean isEnoughtMoney(Integer betSize);
    Integer takeMoney(Integer number);
    void addMoney(Integer number);
}
