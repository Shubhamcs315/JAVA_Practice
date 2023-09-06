import java.util.Scanner;

public class arrayStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxSize = 5; // Maximum size of the stack
        int[] stack = new int[maxSize];
        int top = -1; // Initialize top to -1 to represent an empty stack

        while (true) {
            System.out.println("*************************************");
            System.out.println("\nTotal elements in the stack: " + (top + 1));
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. peek");
            System.out.println("4. View Stack");
            System.out.println("5. Exit");
            System.out.println("*************************************");
            System.out.print("Enter your choice (1/2/3/4/5): ");
            int choice = scanner.nextInt();
            System.out.println("*************************************");

            switch (choice) {
                case 1:
                    if (top < maxSize - 1) {
                        System.out.print("\nEnter the element to push onto the stack: ");
                        int item = scanner.nextInt();
                        top++;
                        stack[top] = item;
                        System.out.println(item + " pushed onto the stack.");
                    } else {
                        System.out.println("\nStack is full. Cannot push.");
                    }
                    break;

                case 2:
                    if (top >= 0) {
                        int poppedElement = stack[top];
                        top--;
                        System.out.println("\nPopped element: " + poppedElement);
                    } else {
                        System.out.println("\nStack is empty. Cannot pop.");
                    }
                    break;

    
                case 3:
                    if (top != -1) {
                        int topElement = stack[top];
                        System.out.println("\nTop element (peek): " + topElement);
                    } else {
                        System.out.println("\nStack is empty. Cannot peek.");
                    }
                    break;
                        
                case 4:
                    System.out.println("\nStack elements:");
                    if (top >= 0) {
                        for (int i = 0; i <= top; i++) {
                            System.out.print(stack[i] + " ");
                        }
                    } else {
                        System.out.print("\nEmpty");
                    }
                    System.out.println("\nTotal elements in the stack: " + (top + 1));
                    break;

                case 5:
                    System.out.println("\nExiting the program.\n");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nInvalid choice. Please enter 1, 2, 3, or 4.");
            }
        }
    }
}
