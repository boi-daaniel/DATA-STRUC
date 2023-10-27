class Queue {
   // Variables
   private int[] queueArray;
   private int front;
   private int rear;
   private final int maxSize;
   
   // Constructor
   public Queue(int size) {
      maxSize = size;
      queueArray = new int[maxSize];
      front = -1;
      rear = -1;
   }
   
   // Enqueue Method
   public void enqueue(int element) {
      if (rear < maxSize - 1) {
         rear++;
         queueArray[rear] = element;
         if (front == -1) {
            front = 0;
         }
            System.out.println(element + " Added in queue");
      }  else {
            System.out.println("Queue is full. Cannot enqueue more elements.");
         }
   }

   // Dequeue Method
   public void dequeue() {
      if (front <= rear && front != -1) {
      int dequeuedElement = queueArray[front];
      if (front == rear) {
         front = -1;
         rear = -1;
      }  else {
            front++;
         }
            System.out.println("Dequeued element: " + dequeuedElement);
      }  else {
            System.out.println("Queue is empty. Cannot dequeue elements.");
         }
   }
   
   // Print front Method
   public void front() {
      if (front != -1) {
         System.out.println("Queue Front element: " + queueArray[front]);
      }  else {
            System.out.println("No front value Queue is empty.");
         }
   }
   
   // Print rear Method
   public void rear() {
      if (rear != -1) {
         System.out.println("Queue Rear element: " + queueArray[rear]);
      }  else {
            System.out.println("No rear value queue is empty.");
         }
   }

   // Display Method
   public void display() {
      if (front != -1) {
         System.out.println("Queue Contents: ");
         for (int i = front; i <= rear; i++) {
            System.out.print(queueArray[i] + " ");
         } 
            System.out.println(); // Seperator
      }  else {
            System.out.println("Queue is empty.");
         }
   }
}
