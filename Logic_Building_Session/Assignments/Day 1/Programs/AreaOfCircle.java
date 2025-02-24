import java.util.Scanner;

class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the Radius: ");
        int r = in.nextInt();
        
        double area = areaOfCircle(r);
        System.out.println("Area of Circle: " + area);
        
    }
    
    static double areaOfCircle(int r) {
        return 3.14 * r * r;
    }
}
