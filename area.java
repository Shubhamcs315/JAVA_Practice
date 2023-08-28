public class area{
    public static void main(String[] args) {
        double radius = 5;
        
        if (radius < 0) {
            System.out.println("Radius cannot be negative");
        } else {
            double area = Math.PI * radius * radius;
            System.out.println("The area of the circle is: " + area);
        }
        
    }
}
