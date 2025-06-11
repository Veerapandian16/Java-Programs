import java.util.*;

public class name_and_age {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter The Name : ");
        String name = sc1.nextLine();
        System.out.print("Enter The Age: ");
        int age = sc1.nextInt();
        System.out.println("Your name is " + name + " And Your Age is " + age);
        sc1.close();
    }
}
