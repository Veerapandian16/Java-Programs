import java.util.*;
public class Odd_and_even
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		if((n&1)==0){
			System.out.print("It is even number");
		}
		else{
		    System.out.print("It is a odd number");
		}
	}
}
