import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter first number: ");
        double num1 = in.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = in.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = in.nextDouble();


        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':

                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
        }


    }
}
