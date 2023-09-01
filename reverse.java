import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int input = sc.nextInt();      
        System.out.println("Input: "+input);
        int reversedNumber = 0;
        int sum = 0;
        
        while (input > 0) {//123//12
            int digit = input % 10; // 3//2
            reversedNumber = reversedNumber * 10 + digit; //0*10+3//3*10+2//
            sum=sum+digit;//0+3+2+1=6
            input /= 10; // 123/10//12
        }
        
        System.out.println("Reversed Number: " + reversedNumber);
        System.out.println("Sum of Digits: " + sum);
        sc.close();
    }
}
