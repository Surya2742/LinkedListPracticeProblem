public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        Node<Integer> firstNode = new Node<>(56);
        ll.add(firstNode);
        Node<Integer> secondNode = new Node<>(70);
        ll.append(secondNode);
        Node<Integer> thirdNode = new Node<>(30);
        ll.insert(firstNode, thirdNode);
        System.out.print("Linked List Sequence: ");
        ll.print();
    }
}
