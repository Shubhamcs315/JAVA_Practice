import java.util.Scanner;

public class Dollar_Rupees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter amount in US Dollars: ");
        double dollars = sc.nextDouble();
        
        double rupees = dollars * 73.5; 
        
        System.out.println(dollars + " US Dollars is equal to " + rupees + " Indian Rupees.");
    }
}
