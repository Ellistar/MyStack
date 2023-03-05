public class MyStack {
    private int maxSize;
    private Object[] elements;
    private int top;
    private int size;

    public MyStack(int max) {
        this.maxSize = max;
        elements = new Object[maxSize];
        top = -1;
        size = 0;
    }

public void push(Object value) {
        elements[++top] = value;
        size++;
    }

    public void remove(int index) {
            Object[] newerArray = new Object[elements.length - 1];
            for (int i = 0, k = 0; i < elements.length; i++) {
                if (i == index) {
                    continue;
                }
                newerArray[k++] = elements[i];
            }
            elements = newerArray;
            size--;
            top--;
        }

    public void clear() {
        elements = new Object[maxSize];
        top = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void peek() {
       if (!(size == 0)) {
           System.out.println(elements[top]);
       } else {
            System.out.println("stack is empty");
        }
    }

    public void pop() {
        if (size == 0) {
            elements = new Object[maxSize];
            top = -1;
        } else {
            System.out.println(elements[top--]);
            size--;
        }
    }
}

