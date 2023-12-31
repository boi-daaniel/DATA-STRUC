class StackDoubly {
    Node head;
    
    // CONSTRUCTOR
    public StackDoubly() {
        head = null;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    // PUSH METHOD
    public void push(int item) {
        Node newNode = new Node(null, item, head);
        if (head != null) {
            head.previous = newNode;
        }
        head = newNode;
    }
    
    //POP METHOD
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1; // Return a value indicating stack underflow
        }
        int item = head.item;
        head = head.next;
        if (head != null) {
            head.previous = null;
        }
        return item;
    }
    
    //POP METHOD
    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1; // Return an invalid value indicating stack is empty
        }
        return head.item;
    }
    

    // DISPLAY METHOD
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            Node current = head;
            System.out.println("Stack List:");
            while (current != null) {
                System.out.println(current.item);
                current = current.next;
            }
        }
    }
}