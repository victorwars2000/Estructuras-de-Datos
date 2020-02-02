public class Cola {
    //int end;
    //int array[] = new int[MAX];
    private static final int MAX = 10;
    private NodoDoble end;
    private NodoDoble head;
    private int numNodes;

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return numNodes;
    }

    public Cola() {
        head = null;
    }

    /*boolean isEmpty() {
        return end < 0;
        //return end < 0;
    }

    public Cola() {
        end = -1;
    }*/

    public boolean encolar(int data) {
        NodoDoble newNode = new NodoDoble(data);
        if (head == null) {
            end = newNode;
            head = newNode;
            numNodes++;
            return true;
        } else if (numNodes >= MAX) {
            System.out.println("Cola llena!");
            return false;
        } else {
            head.setPrev(newNode);
            newNode.setNext(head);
            head = newNode;
            numNodes++;
            return true;
        }
    }

    /*boolean Enacolar(int data) {
        if (end >= (MAX - 1)) {
            System.out.println("Cola llena!");
            return false;
        } else {
            end = end + 1;
            array[end] = data;
            System.out.println("Elemento " + data + " introducido a la cola");
            return true;
        }
    }*/

    public int descolar() {
        if (isEmpty()) {
            System.out.println("La cola esta vacia");
            return -1;
        } else if (head.getNext() == null) {
            int data = end.getData();
            head = null;
            return data;
        } else {
            int data = end.getData();
            end = end.getPrev();
            end.setNext(null);
            return data;
        }
    }

    public void listar() {
        NodoDoble temp = head;
        System.out.print("null");
        while (temp != null) {
            System.out.print("-->" + temp.getData());
            temp = temp.getNext();
        }
    }

    /*int Descolar() {
        if (end < 0) {
            System.out.println("La cola esta vacia");
            return 0;
        } else {
            int data = array[0];
            System.arraycopy(array, 1, array, 0, end);
            *//*for(int i = 1; i<=end; i++){
                array[i-1] = array[i];
            }*//*
            end = end - 1;
            return data;
        }
    }*/

    /*public void listar() {
        for (int i = 0; i <= end; i++)
            System.out.println("Elemento en posicion " + i + " : " + array[i]);
    }*/
}
