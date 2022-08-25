public class Main {
    public static void main(String[] args) {
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
    }
}
