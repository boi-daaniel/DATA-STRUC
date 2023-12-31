import java.util.Scanner;

class TestStackDoubly {
    public static void main(String[] args) {
        StackDoubly stack = new StackDoubly();
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n\t (MENU)");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            
            System.out.print("\nEnter Choice: ");
            int choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int pushValue = input.nextInt();
                    stack.push(pushValue);
                    System.out.println("Item pushed onto the stack.");
                    break;
                case 2:
                    int poppedValue = stack.pop();
                    if (poppedValue != -1) {
                        System.out.println("Popped item: " + poppedValue);
                    }
                    break;
                case 3:
                    int topValue = stack.top();
                    if (topValue != -1) {
                        System.out.println("Top item: " + topValue);
                    }
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting program ...");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try Again");
            }
        }
    }
}