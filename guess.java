import java.util.Scanner;
import java.util.Random;
public class guess {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random ran= new Random();
        int num = ran.nextInt(1,100)+1;
        int maxAttempts=10;
        int attempt=1;
        int score=0;

        //1. Math.random();
        //2. Random class
        
        while(attempt<=maxAttempts){
            System.out.println("-----------------------------");
            System.out.println("Attempt: "+attempt);
            System.out.println("-----------------------------");
            System.out.print("Guess the number: ");
            int guess=sc.nextInt();
            if (guess > 0 && guess < 100) {
                System.out.println("You entered: " + guess);

                if(guess<num){ 
                    System.out.println("Too small");
                }
                else if(guess>num){
                    System.out.println("Too big");
                }
                else{  
                    System.out.println("--****************************--");
                    System.out.println("Yehh!!  You guessed the number "+guess+" in "+ attempt+" attempt");
                    score=maxAttempts-attempt+1;
                    System.out.println("Your score: "+"\n\n...   "+score+"   ...\n");
                    System.out.println("Thanks for playing !");
                    System.out.println("--****************************--");
                    break;
                }
                attempt++;
            } 
            else {
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }
            
        }
        if(attempt>maxAttempts){
            System.out.println("Sorry! you've reached the maximum number of attempts.");  
                    

        }
        sc.close();
    }
}
