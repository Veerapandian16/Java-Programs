package for_loop;

import java.util.Scanner;

public class SkipMultiplesOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            if(i%3!=0){
                System.out.println(i);
            }
        }
    }
}
