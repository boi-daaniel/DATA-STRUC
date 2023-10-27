class Queue {
    private int[] queueArray;
    private int front;
    private int rear;
    private final int maxSize;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
    }

    public void enqueue(int element) {
        if (rear < maxSize - 1) {
            rear++;
            queueArray[rear] = element;
            System.out.println(element + " Enqueued in queue");
        } else {
            System.out.println("Queue is full. Cannot enqueue more elements.");
        }
    }

    public void dequeue() {
        if (front <= rear) {
            int dequeuedElement = queueArray[front];
            front++;
            System.out.println("Dequeued element: " + dequeuedElement);
        } else {
            System.out.println("Queue is empty. Cannot dequeue elements.");
        }
    }

    public void display() {
        System.out.println("Queue Contents:");
        for (int i = front; i <= rear; i++) {
            System.out.println(queueArray[i]);
        }
    }
}