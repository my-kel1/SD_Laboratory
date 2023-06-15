public class StackBasic {
    private int maxSize;
    private int top;
    private int[] stackArray;

    //constructor
    public StackBasic(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; //stack is empty
    }

    // add element on the top of the stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is Full");
            System.exit(1);
        }
        else {
            stackArray[++top] = value;
        }
    }

    // remove element from top of stack
    public void pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            System.exit(1);
        }
        else {
            int popped = stackArray[top--];
        }
    }

    // return top of stack
    public int peek(){
        return stackArray[top];
    }

    public static void main(String[] args) {
        StackBasic stack = new StackBasic(3);
        stack.push(1);
        stack.push(2);
        System.out.println("Top element: " + stack.peek());
        stack.pop();
        System.out.println("Top element: " + stack.peek());
    }
}
