public interface INode<K> {
    K getKey();
    INode<K> getNext();
    void setNext(INode<K> next);
}
