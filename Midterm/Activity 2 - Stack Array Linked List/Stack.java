class Stack {
    private int[] stackArray;
    private int top;
    private final int maxSize;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int element) {
        if (top < maxSize - 1) {
            top++;
            stackArray[top] = element;
            System.out.println(element + " Pushed in stack");
        } else {
            System.out.println("Stack is full. Cannot push more elements.");
        }
    }

    public void pop() {
        if (top >= 0) {
            int poppedElement = stackArray[top];
            top--;
            System.out.println("Popped element: " + poppedElement);
        } else {
            System.out.println("Stack is empty. Cannot pop elements.");
        }
    }

    public void top() {
        if (top >= 0) {
                System.out.println("Stack Top element: " + stackArray[top]);
            } else {
            System.out.println("Stack is empty.");
        }
    }

    public void display() {
        System.out.println("Stack Contents:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }
}
