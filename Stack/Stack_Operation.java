import java.util.Scanner;

public class Stack_Operations {
    private static final int MAX_SIZE = 100;
    private int[] stack = new int[MAX_SIZE];
    private int top = -1;

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow. Cannot push more elements.");
            return;
        }
        stack[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack[top];
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack_Operations stack = new Stack_Operations();
        Scanner scanner = new Scanner(System.in);
        int choice, data;

        while (true) {
            System.out.println("------------------------------------");
            System.out.println("    STACK IMPLEMENTATION PROGRAM    ");
            System.out.println("------------------------------------");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Is Empty");
            System.out.println("5. Is Full");
            System.out.println("6. Exit");
            System.out.println("7. Display");
            System.out.println("------------------------------------");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to push into the stack: ");
                    data = scanner.nextInt();
                    stack.push(data);
                    break;

                case 2:
                    data = stack.pop();
                    if (data != -1)
                        System.out.println("Popped element: " + data);
                    break;

                case 3:
                    data = stack.peek();
                    if (data != -1)
                        System.out.println("Top element: " + data);
                    break;

                case 4:
                    if (stack.isEmpty())
                        System.out.println("Stack is empty.");
                    else
                        System.out.println("Stack is not empty.");
                    break;

                case 5:
                    if (stack.isFull())
                        System.out.println("Stack is full.");
                    else
                        System.out.println("Stack is not full.");
                    break;

                case 6:
                    System.out.println("Exiting from the program.");
                    scanner.close();
                    System.exit(0);
                    break;

                case 7:
                    System.out.println("Display the stack:");
                    stack.display();
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }

            System.out.println();
        }
    }
}
