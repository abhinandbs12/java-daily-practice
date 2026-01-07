import java.util.Scanner;

public class exp12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("CHECKOUT SYSTEM");
        System.out.print("Enter total number of items: ");
        int total_items = sc.nextInt();

        int total_bill = 0;

        for (int i = 1; i <= total_items; i++) {
            System.out.print("Enter the price of item " + i + ": ");
            int item_price = sc.nextInt();

            total_bill += item_price;
            if (item_price > 200) {
                int discount = (item_price * 10) / 100;
                total_bill -= discount;
            }
        }

        System.out.println("Total price after item discounts: " + total_bill);

        if (total_bill <= 1000) {
        }
        else if (total_bill <= 5000) {
            total_bill -= (total_bill * 10) / 100;
        }
        else if (total_bill <= 10000) {
            total_bill -= (total_bill * 20) / 100;
        }
        else {
            total_bill -= (total_bill * 25) / 100;
            total_bill -= 500;
        }
        System.out.println("Final bill amount: " + total_bill);
        sc.close();
    }
}
