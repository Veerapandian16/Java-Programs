import java.util.Arrays;

public class Find_duplicated_elements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 6, 3};

        // the below function is brute force method using nested for loop in a unsorted array
        System.out.println("Duplicate elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
    // the below method represent efficient way to find dupilcates in a and only in a sorted array
     public static void efficient(int[] arr) {
        Arrays.sort(arr); // Sorting the array first

        System.out.println("Duplicate elements in the array:");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }
    }
    
}
