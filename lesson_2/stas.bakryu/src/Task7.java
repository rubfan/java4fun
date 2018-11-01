public class Task7 {
    public static void main(String[] params) {
        int a = Integer.parseInt(params[0]);
        int moneyForDay = 40;
        int firstQvartal = 5;
        int firstBonus = 20;
        int secondQvartal = 7;
        int secondBonus = 50;
        int totalBonus = bonus(a, firstQvartal, secondQvartal, firstBonus, secondBonus);
        costOfHusing(a, totalBonus, moneyForDay);
    }

    public static int bonus(int a, int fQvartal, int sQvartal, int fBonus, int sBbonus) {
        int totalBonus = 0;
        if (a > sQvartal) {
            totalBonus = sBbonus;
        } else if (a > fQvartal) {
            totalBonus = fBonus;
        }
        return totalBonus;
    }

    public static void costOfHusing(int a, int bonus, int moneyForday) {
        int costOfHusing = (a * moneyForday) - bonus;
        System.out.println("Cost Of Housing = " + costOfHusing);
    }
}