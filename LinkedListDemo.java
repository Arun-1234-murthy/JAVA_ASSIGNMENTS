import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
     LinkedList<String> friends = new LinkedList<>();

     friends.add("Arun");
     friends.add("sai");
     friends.add("vamsi");
     System.out.println("List: " + friends); 

     friends.offer("Sudheer");
     friends.offer("kishore");

     System.out.println("After offer: " + friends);
     System.out.println("Poll: " + friends.poll());
     System.out.println("After poll: " + friends);  

       
     friends.addFirst("harsha");
     friends.addLast("kesav");
     System.out.println("Deque: " + friends); 
     friends.removeFirst();
     friends.removeLast();
     System.out.println("After removeFirst & removeLast: " + friends); 
    }
}
