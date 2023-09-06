import java.util.Scanner;

public class ArrayStacks {
    private int maxSize = 5; // Maximum size of the array
    private int[] arr = new int[maxSize];
    private static int top = -1;

    public static void main(String[] args) {
        ArrayStacks p = new ArrayStacks();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("*************************************");
            System.out.println("Elements in array: "+(top+1));
            System.out.println("Enter your choice:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. View array");
            System.out.println("5. Exit");
            System.out.println("*************************************");
            choice = sc.nextInt();
            System.out.println("*************************************");
            switch (choice) {
                case 1:
                    System.out.print("Enter the number you want to push:");
                    int item = sc.nextInt();
                    p.push(item);
                    break;
                case 2:
                    p.pop();
                    break;
                case 3:
                    p.peek();
                    break;
                case 4:
                    p.viewArray();
                    break;
                case 5:
                    p.exit();
                    sc.close();
                    break;
                default:
                    System.out.println("Enter a valid choice between 1 and 5.");
            }
        } while (choice != 5); // Exit the loop when choice is 5
    }

    public void push(int item) {
        if (top < maxSize - 1) {
            top++;
            arr[top] = item;
            System.out.println(item + " pushed.");
        } else {
            System.out.println("Array is full, can't push.");
        }
    }

    public void pop() {
        if (top != -1) {
            int poppedElement = arr[top];
            top--;
            System.out.println(poppedElement + " popped.");
        } else {
            System.out.println("Array is empty, can't pop.");
        }
    }

    public void peek() {
        if (top != -1) {
            System.out.println("Peek element: " + arr[top]);
        } else {
            System.out.println("Array is empty, can't peek.");
        }
    }

    public void viewArray() {
        if (top != -1) {
            System.out.println("Array elements:");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i]+" ");
            }
        } else {
            System.out.println("\nArray is empty, can't view it.");
        }
        System.out.println("\nTotal elements in array: " + (top + 1));
    }

    public void exit() {
        System.out.println("Exiting the program.\n" + //
                "");
        System.exit(0);
    }
}
