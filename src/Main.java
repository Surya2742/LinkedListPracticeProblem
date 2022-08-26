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
        ll.print();
    }
}
