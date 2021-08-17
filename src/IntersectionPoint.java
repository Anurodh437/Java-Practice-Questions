import java.util.LinkedList;

class IntersectionPoint {
    static Node head1, head2;
    //Node class
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //Method to get the intersection point of two linked list
    static int getNode(){
        int c1 = listLength(head1);
        int c2 = listLength(head2);
        int diff;

        if (c1 > c2){
            diff = c1 - c2;
            return _getIntersectionNode(diff,head1,head2);
        }
        else{
            diff = c2 - c1;
            return _getIntersectionNode(diff,head2,head1);
        }
    }

    static int _getIntersectionNode(int diff,Node node1, Node node2){
        Node current1 = node1;
        Node current2 = node2;

        for (int j = 0; j < diff; j++) {
            if (current1 == null){
                return -1;
            }
            current1 = current1.next;
        }

        while (current1!=null && current2!=null){
            if(current1.data == current2.data){
                return current1.data;
            }
            current1 = current2;
            current2 = current2.next;
        }
        return -1;
    }

    //Method to count the length of both the given linked list and takes the head node as a parameter.
    static int listLength(Node node){
        Node current = node;
        int count = 0;

        while (current!=null){
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        head1 = new Node(3);
        head1.next = new Node(6);
        head1.next.next = new Node(9);
        head1.next.next.next = new Node(15);
        head1.next.next.next.next = new Node(30);

        // creating second linked list
        head2 = new Node(10);
        head2.next = new Node(15);
        head2.next.next = new Node(30);

        System.out.println("The node of intersection is " + getNode());

    }
}
