public enum BankNotes {
    ONE(1), TWO(2), FIVE(5), TEN(10), TWENTY(20), FIFTY(50), ONEHUNDRED(100), TWOHUNDRED(200), FIVEHUNDRED(500);

    private int valueOfBankNote;

    BankNotes(int valueOfBankNote) {
        this.valueOfBankNote = valueOfBankNote;
    }

    public int getValueOfBankNote() {
        return valueOfBankNote;
    }
}
