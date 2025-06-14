import java.util.*;

public class Pattern_X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) { // Loop over rows
            for (int j = 0; j < n; j++) { // Loop over columns
                if (i == j || i+j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
