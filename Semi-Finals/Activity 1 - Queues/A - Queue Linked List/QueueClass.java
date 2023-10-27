public class QueueClass{
   QueueNode front;
   QueueNode rear;
   
   //CONSTRUCTORS
   public QueueClass(){
      front = null;
      rear = null;
   }
   
   public QueueClass(QueueNode front, QueueNode rear){
      this.front = front;
      this.rear = rear;
   }
   
   public boolean isEmpty(){
      if(front==null && rear==null)
         return true;
      else
         return false;
   }
   
   // ENQUEUE METHOD
   public void enqueue(int info){
      QueueNode newNode = new QueueNode(null, info, null);
      if (isEmpty()) {
         front = newNode;
         rear = newNode;
      } 
      else {
         rear.next = newNode;
         newNode.previous = rear;
         rear = newNode;
      }
      System.out.println(info + " Added to queue.");
   }
   
   // DEQUEUE METHOD
   public int dequeue(){
      if (isEmpty()) {
         System.out.println("\nQueue is empty.");
         return -1;
      }
      int dequeuedValue = front.info;
      front = front.next;
      if (front == null) {
         rear = null;
      }
      
      System.out.println("Element " + dequeuedValue + " Removed from queue.");
      return dequeuedValue;
   }
   
   // FRONT METHOD
   public void front(){
      if (isEmpty()) {
         System.out.println("\nNo front value queue is empty.");
      } 
      else {
         System.out.println("\nFront element: " + front.info);
      }
   }
   
   // REAR METHOD
   public void rear(){
      if (isEmpty()) {
         System.out.println("\nNo rear value queue is empty.");
      } 
      else {
         System.out.println("\nRear element: " + rear.info);
      }
   }
   
   // PRINT METHOD
   public void print(){
      if (isEmpty()) {
         System.out.println("\nQueue is empty.");
      } 
      else {
         QueueNode current = front;
         System.out.println("\nQueue Contents: ");
         while (current != null) {
            System.out.print(current.info + " ");
            current = current.next;
         }
         System.out.println();
      }
    }
   
}
