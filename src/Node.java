public class Node<K> implements INode<K> {
    public K key;
    private INode<K> next;

    public Node(K key) {
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public INode<K> getNext() {
        return next;
    }

    public void setNext(INode<K> next) {
        this.next = next;
    }
}
