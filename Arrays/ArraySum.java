import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        int sum = 0;

        // Input array elements
        System.out.println("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        // Output the sum
        System.out.println("Sum of array elements: " + sum);

        scanner.close();
    }
}
