/*
Task_7

 Calculate how much it will cost to rent an apartment for a given number of days, if you know that for 1 day its cost is 40 UAH.
 Moreover, if the tenant has lived in it for more than 5 days, he will receive a discount of 20 UAH, and if more than 7 days,
 then the discount will be 50 UAH

*/

class Rent{
    public static void main(String[] params){

        int arenda = 40;
        int discountDay1 = 5;
        int discountDay2 = 7;
        int discount1 = 20;
        int discount2 = 50;
        int rent = 0;
        int days = Integer.parseInt(params[0]);
        if (days >= 0 && days <= discountDay1) {
            rent = days * arenda;
        } else if (days > discountDay1 && days <= discountDay2) {
            rent = days * arenda;
            rent = rent - discount1;
        } else if (days > discountDay2) {
            rent = days * arenda;
            rent = rent - discount2;
        }

        System.out.println("Rent price: " + rent + " UAH");
    }
}


