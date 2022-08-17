import java.util.Stack;
import java.util.Queue;
import java.util.PriorityQueue;

public class Task4_Stack {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.add(20);
        q.add(84);
        q.add(30);
        q.add(70);
        q.add(95);
        q.add(50);
        System.out.println("Queue Elements" + q);
        System.out.println("Elements Removed From the Queue");
        int a = q.remove();
        int b = q.poll();
        System.out.println(a);
        System.out.println(b);
        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(a);
        s1.push(b);
        Stack<Integer> s2 = new Stack<Integer>();
        s2.addAll(q);
        System.out.println("Exsting Elements in the Stack" + s2);
    }
}
