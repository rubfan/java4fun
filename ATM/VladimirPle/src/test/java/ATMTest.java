import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ATMTest {

    @Test
    public void takeBankNotes() {
        ATM atm = new ATM(BankNotes.FIVE, BankNotes.TEN, BankNotes.TWENTY);
        Assert.assertThat(atm.takeBankNotes(BankNotes.FIVE.getValueOfBankNote()), is(true));
    }

    @Test
    public void giveMoneyMin() {
        ATM atm = new ATM(BankNotes.FIVE, BankNotes.TEN, BankNotes.TWENTY);
        Assert.assertThat(atm.giveMoneyMin(20), is(20));
        Assert.assertThat(atm.giveMoneyMin(-50), is(-1));
        Assert.assertThat(atm.giveMoneyMin(450), is(450));
        Assert.assertThat(atm.giveMoneyMin(5000), is(-1));
        Assert.assertThat(atm.giveMoneyMin(50), is(-1));
    }

    @Test
    public void cashBalance() {
        ATM atm = new ATM(BankNotes.FIVE, BankNotes.TEN, BankNotes.TWENTY);
        Assert.assertThat(atm.cashBalance(), is(3500));
    }
}