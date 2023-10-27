import java.util.Scanner;

public class TestQueue {
   public static void main(String[] args) {
      final int MAXSIZE = 5;
      Queue queue = new Queue(MAXSIZE);
      Scanner scanner = new Scanner(System.in);

      while (true) {
         System.out.println("\n \t(MENU)");
         System.out.println("1. Enqueue");
         System.out.println("2. Dequeue");
         System.out.println("3. Front");
         System.out.println("4. Rear");
         System.out.println("5. Display");
         System.out.println("0. Exit");

         System.out.print("\nEnter your choice: ");
         int choice = scanner.nextInt();
         System.out.println();

         switch (choice) {
            case 1:
               System.out.print("Enter element to enqueue: ");
               int element = scanner.nextInt();
               queue.enqueue(element);
               break;
            case 2:
               queue.dequeue();
               break;
            case 3:
               queue.front();
               break;
            case 4:
               queue.rear();
               break;
            case 5:
               queue.display();
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
