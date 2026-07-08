package Task3_LinkedList;

public class LinkedList<T> {

    Node<T> root;

    public LinkedList() {
        root = null;
    }

    public void add(T element) {
        if (root == null) {
            root = new Node<>(element);
        } else {
            Node lastNode = findLast();
            lastNode.setNext(new Node(element));
        }
    }

    private Node findLast() {
        if (root == null)
            return null;
        Node lastNode = root;
        while (lastNode.getNext() != null) {
            lastNode = lastNode.getNext();
        }
        return lastNode;
    }

    public Object get(int index) {
        Node currentNode = root;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode.getValue();
    }
}
