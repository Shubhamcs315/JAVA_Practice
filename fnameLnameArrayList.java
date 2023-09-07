import java.util.Scanner;
import java.util.ArrayList;
public class fnameLnameArrayList {
    public static void main(String[] args){
        int maxSize=5;
        ArrayList<String> fname=new ArrayList<String>();
        ArrayList<String> lname=new ArrayList<String>();
        ArrayList<String> fullname=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first name ");
        for(int i=0;i<maxSize;i++){
            System.out.println("person: "+(i+1));
            fname.add(sc.next());
        }
        System.out.println(fname);
        System.out.println("enter the last name: ");
        for(int i=0;i<maxSize;i++){
            System.out.println("person: "+(i+1));
            lname.add(sc.next());
        }
        System.out.println(lname);
        for(int i=0;i<maxSize;i++){
            String b=fname.get(i)+" "+lname.get(i);
            fullname.add(b);           
        } 
        System.out.println("First and last name :\n");      
        System.out.println(fullname+"\n");
        sc.close();
    }
}