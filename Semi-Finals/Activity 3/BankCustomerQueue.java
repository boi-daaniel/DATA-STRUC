import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BankCustomerQueue {
    public static void main(String[] args) {
        Queue<String> customerQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n\t(MENU)");
            System.out.println("[a] - Add a New Customer");
            System.out.println("[b] - Remove a Customer");
            System.out.println("[c] - Display front Customer");
            System.out.println("[d] - Count of Customers");
            System.out.println("[e] - Display all Customers");
            System.out.println("[f] - QUIT");

            System.out.print("\nEnter your choice: ");
            char choice = scanner.next().charAt(0);
            scanner.nextLine();
            
            System.out.println();

            switch (choice) {
                case 'a':
                    System.out.print("Enter customer name to add: ");
                    String customerName = scanner.nextLine();
                    customerQueue.add(customerName);
                    System.out.println(customerName + " Added in queue");
                    break;
                case 'b':
                    if (!customerQueue.isEmpty()) {
                        String removedCustomer = customerQueue.poll();
                        System.out.println("Removed customer: " + removedCustomer);
                    } else {
                        System.out.println("Queue is empty. Cannot remove customers.");
                    }
                    break;
                case 'c':
                    if (!customerQueue.isEmpty()) {
                        System.out.println("Queue Front customer: " + customerQueue.peek());
                    } else {
                        System.out.println("No front value. Queue is empty.");
                    }
                    break;
                case 'd':
                    System.out.println("Count of Customers: " + customerQueue.size());
                    break;
                case 'e':
                    System.out.println("Queue Contents: " + customerQueue);
                    break;
                case 'f':
                    System.out.println("Exiting Program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Please enter a valid option.");
            }
        }
    }
}
