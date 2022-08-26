import java.util.Scanner;

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

    public void append(INode<K> myNode) {
        if (this.tail == null)
            this.tail = myNode;
        if (this.head == null) {
            this.head = myNode;
        } else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    public void insert(int value, INode<K> newNodeToAddInBetween) {
        INode<K> referenceNode = searchNode(value);
        INode<K> temp = referenceNode.getNext();
        referenceNode.setNext(newNodeToAddInBetween);
        newNodeToAddInBetween.setNext(temp);
    }

    public void pop() {
        INode<K> tempNode = this.head;
        this.head = tempNode.getNext();
        tempNode.setNext(null);
    }

    public void popLast() {
        INode<K> tempNode = this.head;
        if (this.head == this.tail) {
            System.out.println("There is only single element. Select option \n 1. Delete   2.Don't delete");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter option : ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    this.head = null;
                    this.tail = null;
                    break;
                case 2:
                    break;
            }
        }
        else if (tempNode.getNext().getNext() != null) {
            tempNode = tempNode.getNext();
            tempNode.setNext(null);
        }
    }

    public INode<K> searchNode(int value) {
        INode<K> temp = this.head;
        while(!temp.getKey().equals(value) ) {
            temp = temp.getNext();
        }
        return temp;
    }

    public void print() {
        INode<K> temp = head;
        while(temp != null) {
            System.out.print(temp);
            temp = temp.getNext();
        }
        System.out.println();
    }
}
