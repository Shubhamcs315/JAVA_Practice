import java.util.Scanner;
public class table {
    public static void main(String[] args){
        int num=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        num=sc.nextInt();
        for(int i=1 ; i<=10 ; i++){
            System.out.println(num+"*"+i+"="+(num*i));
        }
        sc.close();

    }
    

}
