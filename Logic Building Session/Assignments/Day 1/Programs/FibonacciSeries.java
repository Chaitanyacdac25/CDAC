class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; 
        int a = 0, b = 1;
        
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
