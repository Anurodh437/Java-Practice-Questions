import javax.management.Query;
import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueue {
    static class Stack {
        static Queue<Integer> queue1 = new LinkedList<>();
        static Queue<Integer> queue2 = new LinkedList<>();

        static int curr_size = 0;

        static void push(int x) {
            curr_size++;
            queue2.add(x);

            while (!queue1.isEmpty()) {
                queue2.add(queue1.peek());
                queue1.remove();
            }

            Queue<Integer> q = queue1;
            queue1 = queue2;
            queue2 = q;
        }

        public void pop() {
            if (queue1.isEmpty())
                return;
            queue1.remove();
            curr_size--;
        }

        public static int top() {
            if (queue1.isEmpty())
                return -1;
            return queue1.peek();
        }

        public int size() {
            return curr_size;
        }
    }
    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        Queue q = new LinkedList();
        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());

        System.out.println("current size: " + s.size());
    }
}
