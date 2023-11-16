import java.util.Scanner;

public class TestBSTClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BSTClass bst = new BSTClass();

        while (true) {
            System.out.println("\nBinary Search Tree Operations:");
            System.out.println("1. Insert Node");
            System.out.println("2. Search");
            System.out.println("3. Node Count");
            System.out.println("4. Height");
            System.out.println("5. Inorder Traversal");
            System.out.println("6. Preorder Traversal");
            System.out.println("7. Postorder Traversal");
            System.out.println("0. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int value = scanner.nextInt();
                    bst.insertNode(value);
                    break;
                case 2:
                    System.out.print("Enter value to search: ");
                      int searchValue = scanner.nextInt();
                      if (bst.search(searchValue)) {
                          System.out.println(searchValue + " found in the tree.");
                      } else {
                          System.out.println(searchValue + " not found in the tree.");
                      }
                      break;
                case 3:
                    System.out.println("Node Count: " + bst.getNodeCount());
                     break;
                case 4:
                    System.out.println("Tree Height: " + bst.height());
                     break;
                case 5:
                    System.out.println("Inorder Traversal:");
                    bst.inorder(bst.root);
                    break;
                case 6:
                    System.out.println("Preorder Traversal:");
                    bst.preorder(bst.root);
                    break;
                case 7:
                    System.out.println("Postorder Traversal:");
                    bst.postorder(bst.root);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    scanner.close(); // Close the scanner before exiting
                    System.exit(0); // Terminate the program
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}
