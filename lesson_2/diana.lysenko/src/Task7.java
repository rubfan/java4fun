public class Task7 {
    public static void main(String[] params) {
        int days = Integer.parseInt(params[0]);
        int rent = days * 40;
        if (days>7) { 
            rent-=50;
        }
        else if (days>5) {
            rent-=20;
        }
        System.out.println("Renting an apartment for " + days + " will cost " + rent);
    }
}