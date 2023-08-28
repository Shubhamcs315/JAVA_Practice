import java.util.Scanner;

public class area{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        if (radius < 0) {
            System.out.println("Radius cannot be negative");
        } else {
            double area = Math.PI * radius * radius;
            System.out.println("The area of the circle is: " + area);
        }
        
        scanner.close();
    }
}
