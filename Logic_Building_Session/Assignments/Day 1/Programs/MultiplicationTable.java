import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

    }
}
