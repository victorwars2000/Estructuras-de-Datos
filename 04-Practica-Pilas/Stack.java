public class Stack {
    private Node top;
    private int size;
    private int numElements;
    private int height = 0;

    public void push(int data) {
        Node newNode = new Node(data);
        if (!isEmpty()) {
            newNode.setNext(top);
        }
        top = newNode;
        height += data;
        size++;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("null");
        } else {
            height -= top.getData();
            top = top.getNext();
            size--;
        }
    }

    public int peek() {
        return top.getData();
    }

    public int max() {
        Node temp = top;
        int maxValue = -1;
        while (temp != null) {
            if (temp.getData() > maxValue) {
                maxValue = temp.getData();
            }
            temp = temp.getNext();
        }
        return maxValue;
    }

    public int maximumHeight(Stack s2, Stack s3) {
        while ((this.height != s2.height) || (this.height != s3.height)) {
            if ((this.height > s2.height) || (this.height > s3.height)) {
                this.pop();
            } else if (s2.height > s3.height) {
                s2.pop();
            } else {
                s3.pop();
            }
        }
        return this.height;
    }

    public void print() {
        Node temp = top;
        if (isEmpty()) {
            System.out.println("null");
        }
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
    }

    public int getHeight() {
        return height;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void setNumElements(int numElements) {
        this.numElements = numElements;
    }

    public int getNumElements() {
        return numElements;
    }

    public void setEmptyStack() {
        top = null;
    }

    public int getSize() {
        return size;
    }
}
