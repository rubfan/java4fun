public class Cell implements CellI {
    private static final int DEFUALTSIZE = 100;
    protected MyQueue bankNotesCell;
    protected BankNotes bankNotes;

    Cell(BankNotes bankNotes) {
        this.bankNotes = bankNotes;
    }

    public int getLength() {
        return bankNotesCell.arr.length;
    }

    public int countBalanceInCell() {
        int sum = 0;
        for (int i = 0; i < bankNotesCell.arr.length; i++) {
            sum += bankNotesCell.arr[i];
        }
        return sum;
    }

    public void initCell(BankNotes bankNotes) {
        bankNotesCell = new MyQueue(DEFUALTSIZE);
        for (int i = 0; i < bankNotesCell.getLength(); i++) {
            bankNotesCell.push(bankNotes.getValueOfBankNote());
        }
    }

    public int getBankNote() {
        return bankNotesCell.pop();
    }

}
