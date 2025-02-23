/*  9. Write a program to find and print the largest digit in the number 4825.  */


class P9 {
    public static void main(String[] args) {
        int n = 4825;
        int largest = 0;

        while (n != 0) {
        	int digit = n % 10; 
		if(digit > largest){
			largest = digit;
		}     
        	n /= 10; 
    	}
        System.out.println(largest);
	}
}

