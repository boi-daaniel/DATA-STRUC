import java.util.Scanner;

public class TestStack {
    public static void main(String[] args) {
        final int MAXSIZE = 10;
        Stack stack = new Stack(MAXSIZE);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n \tMENU");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top");
            System.out.println("4. Display");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.top();
                    break;
                case 4:
                    stack.display();
                    break;
                case 0:
                    System.out.println("Exiting Program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
