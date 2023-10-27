import java.util.Scanner;

class TestLinkedList {
   public static void main(String[] args) {
      LinkedList list = new LinkedList();
      Scanner input = new Scanner(System.in);
    
      while(true) {
         System.out.println("\n\t MENU");
         System.out.println("1. Add to Head");
         System.out.println("2. Add to Tail");
         System.out.println("3. Print Head");
         System.out.println("4. print Tail");
         System.out.println("5. Print Forward");
         System.out.println("6. Print Backward");
         System.out.println("7. Remove from Head");
         System.out.println("8. Remove from Tail");
         System.out.println("9. Insert At");
         System.out.println("10. Remove Node at Position");
         System.out.println("11. Quit");
         
         
         System.out.print("\nEnter Choice: ");
         int choice = input.nextInt();
         
         switch(choice) {
            case 1:
               System.out.print("Add to head: ");
               int headValue = input.nextInt(); 
               list.addToHead(headValue);
               System.out.println("Head Added.");
               break;
            case 2:
               System.out.print("Add to tail: ");
               int tailValue = input.nextInt(); 
               list.addToTail(tailValue);
               System.out.println("Tail Added.");
               break;
            case 3:
               if (list.isEmpty()) {
                  System.out.println("List is empty.");
               } else {
                  System.out.println("Head value: " + list.head.item);
               }
               break;
            case 4:
               if (list.isEmpty()) {
                  System.out.println("List is empty.");
               } else {
                  System.out.println("Tail value: " + list.tail.item);
               }
               break;
            case 5:
               if (list.isEmpty()) {
                  System.out.println("List is empty.");
               } else {
                  System.out.println("Printing Forward list:");
                  list.printForward();
               }
               break;
            case 6:
               if (list.isEmpty()) {
                  System.out.println("List is empty.");
               } else {
                  System.out.println("Printing Backward list:");
                  list.printBackward();
               }
               break;
            case 7:
               if(list.isEmpty()){
                  System.out.println("List is empty cannot remove head");
               } else {
                  System.out.println("Head removed.");
                  list.removeHead();
               } 
               break;
            case 8:
               if(list.isEmpty()) {
                  System.out.println("List is empty cannot remove tail");
               } else {
                  System.out.println("Tail removed.");
                  list.removeTail();
               }
               break;
            case 9:
               System.out.print("Enter the value to be inserted: ");
               int insertValue = input.nextInt();
               System.out.print("Enter the value after which to insert: ");
               int searchValue = input.nextInt();
               list.insertNodeAfter(searchValue, insertValue);
               break;
            case 10:               
               System.out.print("Enter Position to remove: ");
               int removePosition = input.nextInt();
               list.removeAt(removePosition);         
               break;
            case 11:
               System.out.println("Exiting program ...");
               input.close();
               System.exit(0);
               break;
            default:
               System.out.println("Invalid choice");
         }
      }
      
      
   }//MAIN
}//CLASS
