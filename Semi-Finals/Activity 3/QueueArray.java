import java.util.Scanner;

class QueueArray {
    private String[] queueArray;
    private int front;
    private int rear;
    private final int maxSize;

    public QueueArray(int size) {
        maxSize = size;
        queueArray = new String[maxSize];
        front = -1;
        rear = -1;
    }

    public void enqueue(String element) {
        if (rear < maxSize - 1) {
            rear++;
            queueArray[rear] = element;
            if (front == -1) {
                front = 0;
            }
            System.out.println(element + " Added in queue");
        } else {
            System.out.println("Queue is full. Cannot enqueue more elements.");
        }
    }

    public void dequeue() {
        if (front <= rear && front != -1) {
            String dequeuedElement = queueArray[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("Dequeued customer: " + dequeuedElement);
        } else {
            System.out.println("Queue is empty. Cannot dequeue elements.");
        }
    }

    public void front() {
        if (front != -1) {
            System.out.println("Queue Front customer: " + queueArray[front]);
        } else {
            System.out.println("No front value. Queue is empty.");
        }
    }

    public void rear() {
        if (rear != -1) {
            System.out.println("Queue Rear customer: " + queueArray[rear]);
        } else {
            System.out.println("No rear value. Queue is empty.");
        }
    }

    public void display() {
        if (front != -1) {
            System.out.println("Queue Contents: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queueArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Queue is empty.");
        }
    }
}