class GoodMorningMessage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	int time = 9; 

        if (time >= 5 && time <= 12) {
            System.out.println("Good Morning!");
        } else {
            System.out.println("Time is not in the morning range.");
        }

    }
}
