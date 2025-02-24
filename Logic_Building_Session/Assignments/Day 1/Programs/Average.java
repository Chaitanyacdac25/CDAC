import java.util.Scanner;
class Average {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Input first number: ");
		double a = in.nextDouble();
		System.out.println("Input second number: ");
		double b = in.nextDouble();
		System.out.println("Input third number: ");
		double c = in.nextDouble();

		 double average = (a + b + c) / 3;

		System.out.println("The average is: " + average);
	}
}