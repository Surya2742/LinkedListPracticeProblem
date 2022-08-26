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
        ll.popLast();
        System.out.print("\nLinked List Sequence after deleting Last Element using Pop Method : ");
        ll.print();
    }
}
