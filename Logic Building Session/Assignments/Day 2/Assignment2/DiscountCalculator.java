import java.util.Scanner;

class DiscountCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter total purchase amount (Rs.): ");
        double purchaseAmount = in.nextDouble();


        System.out.print("Do you have a membership card? (yes/no): ");
        String hasMembership = in.next().toLowerCase();

        double discountPercentage;


        if (purchaseAmount >= 1000) {
            discountPercentage = 20;
        } else if (purchaseAmount >= 500) {
            discountPercentage = 10;
        } else {
            discountPercentage = 5;
        }

        if (hasMembership.equals("yes")) {
            discountPercentage += 5;
        }


        double discountAmount = (discountPercentage / 100) * purchaseAmount;
        double finalPrice = purchaseAmount - discountAmount;


        System.out.println("Total Discount: " + discountPercentage + "%");
        System.out.println("Discount Amount: Rs. " + discountAmount);
        System.out.println("Final Price after Discount: Rs. " + finalPrice);

    }
}
