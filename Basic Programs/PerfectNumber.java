import java.util.Scanner;
public class Perfect_Number
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the perfect number:");
		int num = sc.nextInt();
		int sum=0;
		for(int i =1;i<=num/2;i++){
		    if(num%i==0){
		        sum+=i;
		    }
		}
		  if (sum == num) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is not a Perfect Number.");
        }
		
	}
}
