import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Students {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      ArrayList<String> studentList = new ArrayList<>();
      
      while (true) {
         System.out.println("\nMenu:");
         System.out.println("1. Enroll");
         System.out.println("2. Unenroll");
         System.out.println("3. Print Student List");
         System.out.println("4. Sort");
         System.out.println("5. Search");
         System.out.println("6. Exit");
         
         System.out.print("Enter Choice: ");
         int choice = input.nextInt();
         input.nextLine();
         
         switch (choice) {
            case 1:
               System.out.print("Enter name to enroll: ");
               String enroll = input.nextLine();
               enrollStudent(studentList, enroll);
               break;
            case 2:
               System.out.print("Enter name to un-enroll: ");
               String unenroll = input.nextLine();
               unenrollStudent(studentList, unenroll);
               break;
            case 3:
               print(studentList);
               break;
            case 4:
               sort(studentList);
               System.out.println(studentList);
               break;
            case 5:
               System.out.print("Enter name to search: ");
               String searchName = input.nextLine();
               search(studentList, searchName);
               break;
            case 6:
               System.out.println("Exitting program ...");
               input.close();
               System.exit(0);
               break;
            default:
               System.out.println("Invalid choice try again.");           
         }
      }// End of While
      
   }// main
   
   // Enroll method
   public static void enrollStudent(ArrayList<String> studentList, String name) {
      studentList.add(name);
      System.out.println(name + " has been enrolled.");
   }
   
   // Unenroll method
   public static void unenrollStudent(ArrayList<String> studentList, String name) {
      if(studentList.remove(name)) {
         System.out.println(name + " has been un-enrolled.");
      }
      else {
         System.out.println(name + " is not found in the list try again.");
      }
   }
   
   // Print method
   public static void print(ArrayList<String> studentList) {
      System.out.println("\nStudent List:");
      for(String student : studentList) {
         System.out.println(student);
      }
   }
   
   // Sort method
   public static void sort(ArrayList<String> studentList) {
      Collections.sort(studentList);
      System.out.println("Sorted Student's name:");
   }
   
   // Search method
   public static void search(ArrayList<String> studentList, String name) {
      if(studentList.contains(name)) {
         System.out.println(name + " is enrolled.");
      }
      else {
         System.out.println(name + " not found in the Student List.");
      }
   }
   
}// class
