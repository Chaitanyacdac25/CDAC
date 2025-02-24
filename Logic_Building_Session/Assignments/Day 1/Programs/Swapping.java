import java.util.Scanner;

class Swapping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input first number: ");
        int a = in.nextInt();
        System.out.print("Input second number: ");
        int b = in.nextInt();
        
        System.out.println("Before swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        
        a = a + b;  
        b = a - b;  
        a = a - b; 
        
        System.out.println("After swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        
    }
}
