import java.util.Scanner;
class EvenOrOdd {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Input a number: ");
		int n = in.nextInt();
		if(n % 2 == 0){
		System.out.println("The number " + n + " is Even");
		} else {
		System.out.println("The number " + n + " is Odd");
		} 
	}	
}

