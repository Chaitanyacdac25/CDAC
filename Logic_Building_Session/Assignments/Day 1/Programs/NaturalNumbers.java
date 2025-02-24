import java.util.Scanner;

class NaturalNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int n = in.nextInt();

        System.out.println("The first " + n + " natural numbers are:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

    }
}
