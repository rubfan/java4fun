import java.util.ArrayList;

public class ATM implements ATMI {
    ArrayList<Cell> cells = new ArrayList<Cell>();

    public ATM(BankNotes c1, BankNotes c2, BankNotes c3) {
        Cell c11 = new Cell(c1);
        c11.initCell(c1);
        cells.add(c11);
        Cell c22 = new Cell(c2);
        c22.initCell(c2);
        cells.add(c22);
        Cell c33 = new Cell(c3);
        c33.initCell(c3);
        cells.add(c33);
    }


    public boolean takeBankNotes(int bankNote) {
        for (int i = 0; i < cells.size(); i++) {
            if (cells.get(i).bankNotes.getValueOfBankNote() == bankNote) {
                cells.get(i).bankNotesCell.push(bankNote);
                return true;
            }
        }
        System.out.println("Error: we don't have cells for this bank note");
        return false;
    }

    public int giveMoneyMin(int sum) {
        int retSum = 0;
        // The cells are arranged in descending order!
        int i = 0;
        int counter = 0;
        while (true) {
            int temp = cells.get(i).bankNotes.getValueOfBankNote();
            if (temp <= sum && !(retSum + temp > sum)) {
                retSum += cells.get(i).bankNotesCell.pop();
                if (retSum == sum) {
                    System.out.println("Done");
                    return retSum;
                }
            } else {
                if (i == cells.size() - 1) {
                    i = 0;
                }
                i++;
            }
            counter++;
            if (counter >= 1000) {
                System.out.println("Error: AMT cannot give you sum");
                return -1;
            }
        }
    }

    public int cashBalance() {
        int balance = 0;
        for (int i = 0; i < cells.size(); i++) {
            balance += cells.get(i).countBalanceInCell();
        }
        return balance;
    }
}
