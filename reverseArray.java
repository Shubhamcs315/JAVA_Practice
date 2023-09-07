import java.util.Scanner;
import java.util.ArrayList;
public class reverseArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int maxSize=5;
        System.out.println("Enter the element: ");
        for(int i=1;i<=maxSize;i++){  
            arr.add(sc.nextInt());
        }
        System.out.println("before reverse:");
        System.out.print(arr);
        // for(int b:arr){
        //     System.out.print(b+ " ");
        // }
        // System.out.println();       
        System.out.print("\nafter reverse: \n[");
        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i));
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        sc.close();
       
    }
}
