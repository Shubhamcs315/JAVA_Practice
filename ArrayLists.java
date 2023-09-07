import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int[] a=new int[2];
        a[0]=1;
        a[1]=3;
        System.out.println(a.length);
        System.out.println(arr.size());

        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(3);
        System.out.println(arr);
        System.out.println(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
            
        }
        for(int j=0;j<arr.size();j++){
            System.out.println(arr.get(j));
            
        }
    }
}
