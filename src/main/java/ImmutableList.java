public class ImmutableList<T> {

    private Node<T> head;

    private ImmutableList(Node<T> head) {
        this.head = head;
    }

    public ImmutableList() {
    }

    public int size() {
        return 0;
    }

    public ImmutableList<T> append(T item) {
        if (head == null) {
            return new ImmutableList<>(new Node<>(item, null));
        } else {
            return new ImmutableList<>(new Node<>(item, this.head));
        }
    }

    public T head() {
        return head.payload();
    }
}
