class P26 {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        int num = 1; // Start number

        for (int i = 1; i <= n; i++) { // Loop for rows
            for (int j = 1; j <= i; j++) { // Loop for columns in each row
                System.out.print(num + " ");
                num++; // Increment number
            }
            System.out.println(); // Move to next line
        }
    }
}
