public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        Node<Integer> firstNode = new Node<>(56);
        ll.add(firstNode);
        Node<Integer> secondNode = new Node<>(70);
        ll.append(secondNode);
        Node<Integer> thirdNode = new Node<>(30);
        ll.insert(56, thirdNode);
        System.out.println(ll.searchNode(30));
        System.out.print("Linked List Sequence: ");
        ll.print();
        Node<Integer> fourthNode = new Node<>(40);
        ll.insert(30, fourthNode);
        System.out.print("Linked List Sequence after inserting 40 after 30 : ");
        ll.print();
        System.out.print("Size of Linked List after deleting : ");
        ll.remove(40);
        System.out.print("Size of Linked List Sequence after deleting 40 from linked list : ");
        ll.print();
    }
}
