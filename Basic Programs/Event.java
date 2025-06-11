import java.util.Scanner;

public class Event {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter The Event Name : ");
        String event_name = sc1.nextLine();
        System.out.print("Enter The Event Date : ");
        int date = sc1.nextInt();
        System.out.print("Enter The Event Time(AM/PM) : ");
        int time = sc1.nextInt();
        System.out.print("Enter The Event Venue : ");
        String venue = sc1.nextLine();
        System.out.println("Event Name : " + event_name);
        System.out.println("Event Date : " + date);
        System.out.println("Event Time : " + time);
        System.out.println("Event Venue : " + venue);
        sc1.close();
    }
}
