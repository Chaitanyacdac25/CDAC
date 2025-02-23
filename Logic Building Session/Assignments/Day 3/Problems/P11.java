/* 11. Write a Java program to demonstrate the use of both pre-increment and post-decrement 
operators in a single expression. */

class P11{
	public static void main(String[] args){
	int i = 2;
	System.out.println("The original is " + i);
	System.out.println("The value of i before pre-increment is " + i);
	++i;
	System.out.println("The value of i after pre-increment is " + i);
	System.out.println("The value of i before post- decrement is " + i);	
	i--;
	System.out.println("The value of i after post-decrement is " + i);
	}
}