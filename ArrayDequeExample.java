import java.util.*;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();

        dq.offer("A");
        dq.offerLast("B");
        dq.offerFirst("C");

        System.out.println("Deque: " + dq);

        System.out.println("Removed First: " + dq.pollFirst());
        System.out.println("Removed Last: " + dq.pollLast());
        System.out.println("Deque now: " + dq);
    }
}
