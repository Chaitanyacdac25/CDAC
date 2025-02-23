import java.util.Scanner;

class StudentResult {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter marks for Subject 1: ");
        int subject1 = in.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int subject2 = in.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int subject3 = in.nextInt();


        int failedSubjects = 0;
        failedSubjects += (subject1 < 40) ? 1 : 0;
        failedSubjects += (subject2 < 40) ? 1 : 0;
        failedSubjects += (subject3 < 40) ? 1 : 0;

        switch (failedSubjects) {
            case 0:
                System.out.println("Congratulations! You Passed.");
                break;
            default:
                System.out.println("You failed in " + failedSubjects + " subject(s). Better luck next time!");
                break;
        }


    }
}
