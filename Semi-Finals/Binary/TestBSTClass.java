import java.util.Scanner;

public class TestBSTClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BTClass bst = new BTClass();

        int choice;
        do {
            System.out.println("\nBinary Search Tree Operations:");
            System.out.println("1. Insert Node");
            System.out.println("2. Inorder Traversal");
            System.out.println("3. Preorder Traversal");
            System.out.println("4. Postorder Traversal");
            System.out.println("5. Get Tree Height");
            System.out.println("6. Get Node Count");
            System.out.println("7. Search");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int value = scanner.nextInt();
                    bst.insertNode(value);
                    break;
                case 2:
                    System.out.println("Inorder Traversal:");
                    bst.inorder(bst.root);
                    break;
                case 3:
                    System.out.println("Preorder Traversal:");
                    bst.preorder(bst.root);
                    break;
                case 4:
                    System.out.println("Postorder Traversal:");
                    bst.postorder(bst.root);
                    break;
                case 5:
                    System.out.println("Tree Height: " + bst.height());
                    break;
                case 6:
                    System.out.println("Node Count: " + bst.getNodeCount());
                    break;
                case 7:
                    System.out.print("Enter value to search: ");
                    int searchValue = scanner.nextInt();
                    if (bst.search(searchValue)) {
                        System.out.println(searchValue + " found in the tree.");
                    } else {
                        System.out.println(searchValue + " not found in the tree.");
                    }
                    break;
                case 8:
                    System.out.println("Exiting... Bye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 8);

        scanner.close();
    }
}
