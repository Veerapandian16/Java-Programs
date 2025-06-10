import java.util.*;
public class Palindrome{
    
    public static void solve(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int original =n;
        int result=0;
        while(n!=0){
            int digit = n%10;
            result = result * 10 + digit;
            n/=10;
        }
        if(result==original){
            System.out.print("It is palindrome number");
        }
        else{
            System.out.print("It is not an palindrome number");
        }
    }
    public static void main(String[] args){
        solve();
    }
}
