import java.util.Scanner;

public class linear{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] arr = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to search for: ");
        int searchValue = scanner.nextInt();

        int foundIndex = -1;

        for (int i = 0; i < length; i++) {
            if (arr[i] == searchValue) {
                foundIndex = i;
                break;
            }
        }

        System.out.println(foundIndex != -1 ? "Value found at index " + foundIndex : "Value not found in the array.");

        scanner.close();
    }
}
