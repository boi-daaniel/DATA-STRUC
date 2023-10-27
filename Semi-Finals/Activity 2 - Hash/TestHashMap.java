import java.util.HashMap;
import java.util.Scanner;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n \tMENU");
            System.out.println("1. Add key-value pair");
            System.out.println("2. Remove key");
            System.out.println("3. Get value by key");
            System.out.println("4. Display all key-value pairs");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.print("Enter key: ");
                    int key = scanner.nextInt();
                    System.out.print("Enter value: ");
                    int value = scanner.nextInt();
                    hashMap.put(key, value);
                    System.out.println("Key-Value pair added to hash table.");
                    break;
                case 2:
                    System.out.print("Enter key to remove: ");
                    int keyToRemove = scanner.nextInt();
                    if (hashMap.containsKey(keyToRemove)) {
                        hashMap.remove(keyToRemove);
                        System.out.println("Key removed from hash table.");
                    } else {
                        System.out.println("Key not found in hash table.");
                    }
                    break;
                case 3:
                    System.out.print("Enter key to get value: ");
                    int keyToGet = scanner.nextInt();
                    if (hashMap.containsKey(keyToGet)) {
                        int retrievedValue = hashMap.get(keyToGet);
                        System.out.println("Value for key " + keyToGet + ": " + retrievedValue);
                    } else {
                        System.out.println("Key not found in hash table.");
                    }
                    break;
                case 4:
                    System.out.println("Hash Table Contents:");
                    for (int k : hashMap.keySet()) {
                        System.out.println("Key: " + k + ", Value: " + hashMap.get(k));
                    }
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
