import java.util.*;

class TestClass {
    public static void main(String[] args)
    {
        final int MAXSIZE = 10;
        int[] myArray = new int[MAXSIZE];
        Scanner scanner = new Scanner(System.in);
        ArrayOperations Ao = new ArrayOperations(MAXSIZE);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("0. Populate Array");
            System.out.println("1. Print Array");
            System.out.println("2. Find MIN");
            System.out.println("3. Find MAX");
            System.out.println("4. Insert at the Beginning");
            System.out.println("5. Insert in the Middle");
            System.out.println("6. Insert at the End");
            System.out.println("7. Remove Item");
            System.out.println("8. Search for Item");
            System.out.println("9. Sort Array");
            System.out.println("10. Quit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    Ao.populate(myArray); 
                    break;
                case 1:
                    Ao.print(myArray);
                    break;
                case 2:
                    System.out.println("MIN: " + Ao.getMin(myArray));
                    break;
                case 3:
                    System.out.println("MAX: " + Ao.getMax(myArray));
                    break;
                case 4:
                    System.out.print("Enter element to insert at the beginning: ");
                    int element = scanner.nextInt();
                    myArray = Ao.insertBeginning(element, myArray);
                    break;
                case 5:
                    System.out.print("Enter element to insert: ");
                    element = scanner.nextInt();
                    System.out.print("Enter position to insert at: ");
                    int position = scanner.nextInt();
                    myArray = Ao.insertMiddle(element, position, myArray);
                    break;
                case 6:
                    System.out.print("Enter element to insert at the end: ");
                    element = scanner.nextInt();
                    myArray = Ao.insertEnd(element, myArray);
                    break;
                case 7:
                    System.out.print("Enter element to remove: ");
                    element = scanner.nextInt();
                    myArray = Ao.removeItem(element, myArray);
                    break;
                case 8:
                    System.out.print("Enter element to search: ");
                    element = scanner.nextInt();
                    int searchResult = Ao.search(element, myArray);
                    if (searchResult != -1) {
                        System.out.println("Found " + element + " at index " + searchResult);
                    } else {
                        System.out.println(element + " not found in the array.");
                    }
                    break;
                case 9:
                    myArray = Ao.sort(myArray);
                    System.out.println("Array after sorting:");
                    Ao.print(myArray);
                    break;
                case 10:
                    System.out.println("Quitting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}