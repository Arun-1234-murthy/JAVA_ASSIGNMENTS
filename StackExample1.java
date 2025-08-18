import java.util.*;
public class StackExample1 {
    public static void main(String[] args) {
        Stack<String> rack1 = new Stack<>();
        rack1.push("Mahabharatha");
        rack1.push("Ramayana");
        rack1.push("Lord of war");
        rack1.push("Bhagavathgitha");
        
        System.out.println("In Rack 1 books are: "+rack1);

        System.out.println("Top book is: "+rack1.peek());

        System.out.println("Popped book is: "+rack1.pop());

        System.out.println("After pop books are : "+rack1);

        System.out.println("Position of Mahabharatha is: "+rack1.search("Mahabharatha"));

        System.out.println("is it empty tack: "+rack1.empty());
    }
}
