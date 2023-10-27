import java.util.Scanner;

public class TestQueue{
   public static void main(String[] args){
      QueueClass queue = new QueueClass();
      Scanner scanner = new Scanner(System.in);
      
      while (true) {
         System.out.println("\n MENU");
         System.out.println("1. Enqueue");
         System.out.println("2. Dequeue");
         System.out.println("3. Print Front");
         System.out.println("4. Print Rear");
         System.out.println("5. Print Queue");
         System.out.println("6. Exit");
         System.out.print("Enter your choice: ");
          
         int choice = scanner.nextInt();
         switch (choice) {
            case 1:
               System.out.print("Enter element to enqueue: ");
               int enqueueValue = scanner.nextInt();
               queue.enqueue(enqueueValue);
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
               queue.print();
               break;
            case 6:
               System.out.println("Exiting...");
               System.exit(0);
               break;
            default:
               System.out.println("Invalid");
         }
      }
   }
}