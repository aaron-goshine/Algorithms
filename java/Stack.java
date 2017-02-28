/**
 * Created by Aaron.goshine on 18/09/15.
 */
public class Stack<item> {

    private Node first = null;

    private class Node {
        item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    public item pop() {
        item item = first.item;
        first = first.next;
        return item;
    }
}
