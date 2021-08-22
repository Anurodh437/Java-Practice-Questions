import java.util.Stack;

class LinkedListUsingStack {
    static class Node {
        int data;
        Node next;
    }
    static Node head = null;

    static void push(int newData) {
        Node newNode = new Node();

        newNode.data = newData;
        newNode.next = (head);
        (head) = newNode;
    }

    static Node reverseList(Node head) {
        Stack<Node> stack = new Stack<>();

        Node current = head;
        while (current.next != null)
        {
            stack.push(current);
            current = current.next;
        }
        head = current;
        while (!stack.isEmpty()) {
            current.next = stack.peek();
            current = current.next;
        }
        current.next = null;
        return head;
    }
    static void printList(Node head)
    {
        while (head != null)
        {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        head = reverseList(head);
        printList(head);
    }
}
