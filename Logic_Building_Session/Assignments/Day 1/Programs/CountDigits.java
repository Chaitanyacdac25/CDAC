import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Input number: ");
        int num = in.nextInt();

        int count = 0;
        int temp = num; 


        while (num != 0) {
            num /= 10;  
            count++;    
        }


        System.out.println("The number " + temp + " has " + count + " digits.");


    }
}
