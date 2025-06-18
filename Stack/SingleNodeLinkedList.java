class Node {
    int data;
    Node next;
}

public class Single_Node_Linked_List {
    static Node head;

    static void create(int data) {
        head = new Node();
        head.data = data;
        head.next = null; 
    }

    static void display(){
        if (head == null) {
            System.out.println("Memory was not created");
        } else {
            System.out.println(head.data);
        }
    }

    public static void main(String[] args) {
        create(10); 
        display();
    }
}
