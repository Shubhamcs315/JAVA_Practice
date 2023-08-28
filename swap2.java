public class swap2 {
    public static void main(String args[]){
        int a=4,b=2;
        System.out.println("Before Swap: a="+a+" b="+b);
        a=a+b;
        b=a-b;
        a=b-a;
        System.out.println("After Swap: a="+a+" b="+b);

    }
}
