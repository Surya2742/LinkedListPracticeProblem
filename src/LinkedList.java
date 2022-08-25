public class LinkedList<K> {
    public INode<K> head;
    public INode<K> tail;
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode<K> newNode) {
        if(this.head == null)
            this.head = newNode;
        if (this.tail == null)
            this.tail = newNode;
        else {
            newNode.setNext(this.head);
            this.head= newNode;
        }
    }

    public void print() {
        INode<K> temp = head;
        while(temp != null) {
            System.out.print(temp);
            temp = temp.getNext();
        }
    }
}