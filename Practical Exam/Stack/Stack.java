class Stack {
    private char[] stackArray;
    private int top;
    private final int maxSize;

    public Stack(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char element) {
        if (top < maxSize - 1) {
            top++;
            stackArray[top] = element;
        } else {
            System.out.println("Stack is full. Cannot push more elements.");
        }
    }

    public char pop() {
        if (top >= 0) {
            char poppedElement = stackArray[top];
            top--;
            return poppedElement;
        } else {
            // Handle stack underflow (stack is empty)
            return '\0'; // Return a default value indicating empty stack
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
}