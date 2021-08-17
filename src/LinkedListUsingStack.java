import java.util.LinkedList;
import java.util.Stack;

public class LinkedListUsingStack {
    static class Node {
        int data;
        Node next;

        static Node head = null;

        static void push(int newData) {
            Node newNode = new Node();

            newNode.data = newData;
            newNode.next = head;
            head = newNode;
        }

        static Node reverseList(Node head) {
            Stack<Node> stack = new Stack<>();
            Node current = head;

            while (current.next != null) {
                stack.push(current);
                current = current.next;
            }
            head = current;
            while (!stack.isEmpty()) {
                current.next = stack.peek();
                current = current.next;
            }
            return head;
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
    }
}
