/* 7. Write a program to calculate the sum of the digits of the number 9876. The output should be 
30 (9 + 8 + 7 + 6).  */


class P7 {
    public static void main(String[] args) {
        int n = 9876;
        int sum = 0;
        String result = "";

        while (n != 0) {
            int digit = n % 10;  
            sum += digit;  
            result = digit + (result.isEmpty() ? "" : " + ") + result;  
            n /= 10;  
        }

        System.out.println(sum + " (" + result + ")");
    }
}

