public class Pila {
    private Nodo top;
    private int size;

    public void push(int data) {
        Nodo newNode = new Nodo(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.setNext(top);
            top = newNode;
        }
        size++;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("null");
        } else {
            top = top.getNext();
            size--;
        }
    }

    public void printStack() {
        Nodo temp = top;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public int max() {
        int max = top.getData();
        Nodo temp = top;
        while (temp != null) {
            if (temp.getData() > max) {
                max = temp.getData();
            }
            temp = temp.getNext();
        }
        return max;
    }

    public boolean isEmpty() {
        return top == null;
    }
}