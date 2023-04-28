import java.util.Iterator;

public class MyLinkedList<Object> implements Iterable<Object> {
    private Node<Object> head;
    private Node<Object> tail;

    public void add(Object data) {
        Node<Object> node = new Node<>(data);
        if (tail == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    public void remove(Object data) {
        Node<Object> node = head;
        while (node != null) {
            if (node.data.equals(data)) {
                if (node.prev != null) {
                    node.prev.next = node.next;
                } else {
                    head = node.next;
                }
                if (node.next != null) {
                    node.next.prev = node.prev;
                } else {
                    tail = node.prev;
                }
                return;
            }
            node = node.next;
        }
    }

    @Override
    public Iterator<Object> iterator() {
        return new Iterator<Object>() {
            private Node<Object> node = head;

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public Object next() {
                Object data = node.data;
                node = node.next;
                return data;
            }
        };
    }

    private static class Node<Object> {
        Object data;
        Node<Object> prev;
        Node<Object> next;

        Node(Object data) {
            this.data = data;
        }
    }
}
