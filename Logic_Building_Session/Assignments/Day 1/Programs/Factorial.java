import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input a number: ");
        int num = in.nextInt();
        
        long fact = 1;  
        for (int i = 1; i <= num; i++) {
            fact *= i;  
        }
        
        System.out.println("Factorial of " + num + " is " + fact);
        in.close();
    }
}
