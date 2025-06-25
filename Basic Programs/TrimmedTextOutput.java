package input_output;

import java.util.Scanner;

public class TrimmedTextOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        String trimmed = a.trim();
        System.out.println("'" + trimmed + "'");
    }
    
}
