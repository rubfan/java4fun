import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;


public class CellTest {
    @Test
    public void initCell() {
        Cell cell = new Cell(BankNotes.FIFTY);
        cell.initCell(BankNotes.TEN);
        for (int i = 0; i < cell.getLength(); i++) {
            cell.bankNotesCell.pop();
        }
        Assert.assertThat(cell.bankNotesCell.pop(), is(0));
    }

    @Test
    public void getBankNote() {
        Cell cell = new Cell(BankNotes.FIVEHUNDRED);
        cell.initCell(BankNotes.FIVEHUNDRED);
        Assert.assertThat(cell.getBankNote(), is(BankNotes.FIVEHUNDRED.getValueOfBankNote()));
    }

    @Test
    public void countBalanceInCell() {
        Cell cell = new Cell(BankNotes.FIVEHUNDRED);
        cell.initCell(BankNotes.FIVEHUNDRED);
        Assert.assertThat(cell.countBalanceInCell(),is(50000));
    }

}