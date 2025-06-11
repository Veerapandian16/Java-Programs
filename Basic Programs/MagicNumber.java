import java.util.Scanner;

public class Magic_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum=0;
        int rev =0;
        int num=n;
        while(n>0){
           int rem = n %10;
            sum += rem;
            n/=10;
        }
        int temp=sum;
        while(sum>0){
            int rem = sum %10;
            rev = (rev * 10) + rem;
            sum /= 10;
        }
       int res = temp * rev;
        if (res==num){
            System.out.println("It is a Magic Number");
        }
        else{
            System.out.println("It is not a Magic Number");
        }
    }
}

/* input num = 1729 then sum = 19 reverse = 91 now multiply sum and rev = 1729 */
