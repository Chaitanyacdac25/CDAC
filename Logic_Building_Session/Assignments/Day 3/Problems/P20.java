/*
20. Write a program to print the following pattern: 
5 
5*4 
5*4*3 
5*4*3*2 
5*4*3*2*1 
*/

class P20 {
    public static void main(String[] args) {
        int n = 5; 
        
        for (int i = 1; i <= n; i++) {
            int num = 5; 
            for (int j = 1; j <= i; j++) {
                System.out.print(num); 
                if (j < i) {
                    System.out.print("*");
                }
                num--; 
            }
            System.out.println(); 
        }
    }
}
