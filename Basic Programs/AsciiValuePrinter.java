package input_output;

import java.util.Scanner;

public class AsciiValuePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int ascii = (int) a;
        System.out.println("ASCII value of " + a + " is " + ascii);
    }
}
