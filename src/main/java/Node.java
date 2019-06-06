class Node<T> {

    private T payload;
    private Node<T> previous;

    Node(T payload, Node<T> previous) {
        this.payload = payload;
        this.previous = previous;
    }

    public T payload() {
        return payload;
    }

    public Node<T> previous() {
        return previous;
    }

    public Node<T> withPrevious(Node<T> previousItem) {
        return new Node<>(payload, previousItem);
    }
}
