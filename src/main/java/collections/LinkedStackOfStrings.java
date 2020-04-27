package collections;

public class LinkedStackOfStrings {
    private Node first = null;
    private class Node {
        String item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(String item) {
        Node old = first;
        first = new Node();
        first.item = item;
        first.next = old;
    }

    public String pop() {
        if(first == null) {
            return "";
        }
        String item = first.item;
        first = first.next;
        return item;
    }

    public static void main(String[] args) {
        LinkedStackOfStrings stack = new LinkedStackOfStrings();
        stack.push("a");
        stack.push("b");
        String top = stack.pop();
        assert(top.equals("b"));
        stack.push("c");
        top = stack.pop();
        assert(top.equals("c"));
        assert(!stack.isEmpty());
        stack.pop();
        assert(stack .isEmpty());

    }
}
