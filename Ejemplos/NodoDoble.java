public class NodoDoble {
    private int data;
    private NodoDoble next;
    private NodoDoble prev;

    public NodoDoble(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodoDoble getNext() {
        return next;
    }

    public void setNext(NodoDoble next) {
        this.next = next;
    }

    public NodoDoble getPrev() {
        return prev;
    }

    public void setPrev(NodoDoble prev) {
        this.prev = prev;
    }
}
