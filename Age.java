import java.util.Scanner;
class Age{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your fname:");
        String fname=sc.nextLine();
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("Hello "+fname+", your age is "+age+".");
        sc.close();


    }
}
