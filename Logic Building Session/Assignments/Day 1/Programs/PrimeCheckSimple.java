import java.util.Scanner;

class PrimeCheckSimple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input number: ");
        int num = in.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false; 
        } else {
            for (int i = 2; i < num; i++) { 
                if (num % i == 0) {
                    isPrime = false;
                    break; //
                }
            }
        }

        if (isPrime) {
            System.out.println("The number " + num + " is Prime.");
        } else {
            System.out.println("The number " + num + " is Not Prime.");
        }


    }
}
