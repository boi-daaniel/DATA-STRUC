import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BankCustomerQueue {
    public static void main(String[] args) {
        Queue<String> customerQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n\t(MENU)");
            System.out.println("1. Add a New Customer");
            System.out.println("2. Remove a Customer");
            System.out.println("3. Display front Customer");
            System.out.println("4. Count of Customers");
            System.out.println("5. Display all Customers");
            System.out.println("6. QUIT");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name to add: ");
                    String customerName = scanner.nextLine();
                    customerQueue.add(customerName);
                    System.out.println(customerName + " Added in queue");
                    break;
                case 2:
                    if (!customerQueue.isEmpty()) {
                        String removedCustomer = customerQueue.poll();
                        System.out.println("Removed customer: " + removedCustomer);
                    } else {
                        System.out.println("Queue is empty. Cannot remove customers.");
                    }
                    break;
                case 3:
                    if (!customerQueue.isEmpty()) {
                        System.out.println("Queue Front customer: " + customerQueue.peek());
                    } else {
                        System.out.println("No front value. Queue is empty.");
                    }
                    break;
                case 4:
                    System.out.println("Count of Customers: " + customerQueue.size());
                    break;
                case 5:
                    System.out.println("Queue Contents: " + customerQueue);
                    break;
                case 6:
                    System.out.println("Exiting Program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Please enter a valid option.");
            }
        }
    }
}