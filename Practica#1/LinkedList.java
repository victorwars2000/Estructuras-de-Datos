public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void addAtHead(int data) {
        Node temp = head;
        head = new Node(data);
        head.setNext(temp);
        size++;
    }

    public void addAtTail(int data) {

        if (head == null) addAtHead(data);
        else {
            Node temp = head;
            while (temp.getNext() != null) temp = temp.getNext();
            temp.setNext(new Node(data));
            size++;
        }

    }

    public void printList() {
        Node temp = head;
        System.out.print("[");
        while (temp.getNext() != null) {
            System.out.print(temp.getData() + ",");
            temp = temp.getNext();
        }
        System.out.println(temp.getData() + "]");
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
        } else {
            Node previous = null;
            Node current = head;
            while (current != null && data > current.getData()) {
                previous = current;
                current = current.getNext();
            }
            if (previous == null) {
                newNode.setNext(head);
                head = newNode;
            } else {
                previous.setNext(newNode);
                newNode.setNext(current);
            }
            size++;
        }
    }

    private Node getNode(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.getData() == data) return temp;
            temp = temp.getNext();
        }
        return null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        Node temp = head;
        if (temp == null) return null;
        else {
            while (temp.getNext() != null)
                temp = temp.getNext();
            return temp;
        }
    }

    public void remove(int data) {
        Node temp;
        if (head == null) System.out.println("List is empty");
        else if (head.getData() == data) {
            head = head.getNext();
            size--;
        } else {
            Node previous = head;
            Node current = head.getNext();
            while (current != null && data != current.getData()) {
                previous = current;
                current = current.getNext();
            }
            if (current != null) {
                temp = current;
                previous.setNext(current.getNext());
                size--;
            }
        }
    }

    public Node removeDuplicates(Node head) {
        if (head == null || head.getNext() == null) return head;
        head.setNext(removeDuplicates(head.getNext()));
        return (head.getData() == head.getNext().getData()) ? head.getNext() : head;
    }

    public Node mergeTwoLists(Node head1, Node head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;

        if (head1.getData() <= head2.getData()) {
            head1.setNext(mergeTwoLists(head1.getNext(), head2));
            return head1;
        } else {
            head2.setNext(mergeTwoLists(head2.getNext(), head1));
            return head2;
        }
    }
}
