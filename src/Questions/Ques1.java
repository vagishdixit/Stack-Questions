package Questions;

//Simple Stack Implementation

public class Ques1 {

    private int top;
    private Integer[] myArr;
    private int size;

    private Ques1(int maxSize) {
        top = -1;
        size = maxSize;
        myArr = new Integer[size];
    }

    private boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }

    private void push(int element) {
        if (isFull()) {
            System.out.println("Stack is Full");
        }

        myArr[++top] = element;
        System.out.println("Element is pushed!!!!");
    }

    private int pop() {
        System.out.print("Poped Element is ->");
        return myArr[top--];
    }

    private void peek() {
        System.out.print("Top element is ->" + myArr[top]);
        System.out.println("");
    }

    public static void main(String[] args) {

        Ques1 stack = new Ques1(5);
        stack.push(10);
        stack.push(12);
        stack.peek();
        stack.push(14);
        stack.push(15);
        stack.push(16);

        while (!stack.isEmpty()) {
            int value = stack.pop();
            System.out.println("Element poped is -> " + value);
        }


    }

}

