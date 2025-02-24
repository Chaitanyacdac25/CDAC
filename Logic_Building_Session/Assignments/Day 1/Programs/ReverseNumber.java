import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Input number: ");
        int num = in.nextInt();


        int reversed = 0;


        while (num != 0) {
            int digit = num % 10;  
            reversed = reversed * 10 + digit; 
            num = num / 10; 
        }

        System.out.println("The reverse of the number is: " + reversed);

    }
}
