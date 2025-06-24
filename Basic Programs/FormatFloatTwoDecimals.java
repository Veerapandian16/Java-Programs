package input_output;

import java.util.Scanner;

public class FormatFloatTwoDecimals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        float a = sc.nextFloat(); // String formattedValue = String.format("%.2f", a); so no need of f in print like printf
        System.out.printf("%.2f" , a); // prinf need for string format to get float decimal values
    }
}
 

