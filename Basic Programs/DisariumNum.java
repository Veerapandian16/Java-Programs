import java.util.*;
public class Disarium_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int a = n;
        int b = a;
        int count = 0;
        int rem=0;
        int sum=0;
        while(n>0){
            count++;
            n/=10; 
        }
        while(a>0){
            rem = a%10;
            int p =1;
            for(int i =1;i<=count;i++){
                p = p* rem;
            }
            sum=sum+p;
            a/=10;
            count--;
        }
        if(sum==b){
            System.out.println("It is an Disarium Number");
        }
        else{
            System.out.println("It is not an Disarium Number");
        }
    }
}
