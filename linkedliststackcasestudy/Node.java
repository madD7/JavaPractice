package linkedliststackcasestudy;

public class Node {
    private final int v;
    private final Node next;

    public Node(int v, Node next) {
        this.v = v;
        this.next = next;
    }

    public int getV() {
        return v;
    }

    public Node getNext() {
        return next;
    }  
}