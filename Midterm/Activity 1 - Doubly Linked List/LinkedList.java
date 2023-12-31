class LinkedList {
   Node head;
   Node tail;
   
   public LinkedList() {
      head=null;
      tail=null;
   }
   
   public boolean isEmpty() {
      if(head==null && tail==null)
         return true;
      else
         return false;
   }
   
   public void addToHead(int item) {
      if(isEmpty()) {
         Node newNode = new Node(null, item, null);
         head=tail=newNode;
      } else{
            Node newNode = new Node(null, item, head);
            head=newNode;
            head.next.previous=head;
      }
   }
   
   public void addToTail(int item) {
      if(isEmpty()) {
         Node newNode = new Node(null, item, null);
         head=tail=newNode;
      } else{
            Node newNode = new Node(tail, item, null);
            tail = newNode;
            tail.previous.next = tail;

      }
   }
   
   public void printForward() {
      System.out.println("Forward:");
      Node current;
      current=head;
      while (current!=null) {
         System.out.println(current.item);
         current=current.next;
      }
   }
   
    public void printBackward() {
      System.out.println("Backward:");
      Node current;
      current=tail;
      while (current!=null) {
         System.out.println(current.item);
         current=current.previous;
      }
   }
   
   // Remove head
   public void removeHead() {
      if (!isEmpty()) {
         if (head == tail) {
            head = tail = null;
         } else {
            head = head.next;
            head.previous = null;
       }
      }
   }
    
   // Remova tail
   public void removeTail() {
      if (!isEmpty()) {
         if (head == tail) {
            head = tail = null;
         } else {
            tail = tail.previous;
            tail.next = null;
         }
      }
   }
   
    // Remove at
    public void removeAt(int position) {
      Node current = head;
       
      int currentPosition = 0;
      while (current != null && currentPosition != position) {
         current = current.next;
         currentPosition++;
      }
             
      if (current != null) {
         if (current.previous != null) {
            current.previous.next = current.next;
         } else {
            // If the node to be removed is the head
            head = current.next;
            }
       
            if (current.next != null) {
               current.next.previous = current.previous;
            } else {
               // If the node to be removed is the tail
               tail = current.previous;
               }     
               current = null;
               System.out.println("Node Removed");
      }
      else {
            System.out.println("Node not found at position: " + position);
      }
    }
    
    
   
   // Insert method
   public void insertNodeAfter(int valueAfter, int insertValue) {                     
        Node newNode = new Node(null, insertValue, null);
        Node temp = head; 
               
        while (temp != null && temp.item != valueAfter) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("item not found.");
        } 
        else {
            newNode.next = temp.next;
            temp.next = newNode;
            newNode.previous = temp;
            System.out.println("Node Inserted");
            if (newNode.next != null) {
                newNode.next.previous = newNode;
            } else {
                tail = newNode;
              }
        }
                     
    }
        
}// Class