package Questions;

// Implementation of double stack

public class Ques3 {

    private int top1;
    private int top2;
    private int size;
    private Integer[] myArr;

    private Ques3(int maxSize) {
        size = maxSize;
        top1 = -1;
        top2 = size;
        myArr = new Integer[size];
    }

    private void push1(int element) {
        if (top1 < top2 - 1) {
            myArr[++top1] = element;
            System.out.println("Element push is -> " + element);
        } else
            System.out.println("Stack OverFlow");
    }

    private void push2(int element) {
        if (top1 < top2 - 1) {
            myArr[--top2] = element;
            System.out.println("Element push is -> " + element);
        } else System.out.println("Stack OverFlow");
    }

    private void pop1() {
        if (top1 >= 0)
            System.out.println("Element Popped is -> " + myArr[top1--]);
        else
            System.out.println("Stack UnderFlow");
    }

    private void pop2() {
        if (top2 < size)
            System.out.println("Element Popped is -> " + myArr[top2++]);
        else
            System.out.println("Stack UnderFlow");
    }

    private void peek1() {
        System.out.println("Element at top1 -> " + myArr[top1]);
    }

    private void peek2() {
        System.out.println("Element at top2 -> " + myArr[top2]);
    }

    public static void main(String args[]) {
        Ques3 ts = new Ques3(5);
        ts.push1(5);
        ts.push2(10);
        ts.peek1();
        ts.peek2();
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        ts.peek1();
        ts.peek2();
        ts.pop1();
        ts.pop2();
        ts.peek1();
        ts.peek2();
    }
}


