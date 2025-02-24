import java.util.Scanner;

class PowerCalculation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Input base number: ");
        int base = in.nextInt();

        System.out.print("Input exponent number: ");
        int exponent = in.nextInt();


        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println(base + " raised to the power " + exponent + " is " + result);


    }
}
