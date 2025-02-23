class P5 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1;
        System.out.print(num1 + " " + num2 + " ");

        int nextNum = num1 + num2;
        while (nextNum <= 21) { 
            System.out.print(nextNum + " "); 
            num1 = num2; 
            num2 = nextNum; 
            nextNum = num1 + num2; 
        }
    }
}
