import java.util.*;
public class VectorExample1 {
    public static void main(String[] args) {
        Vector<String> bikesSet1 = new Vector<>();
        bikesSet1.add("Pulsar");
        bikesSet1.add("Splender");
        bikesSet1.add("FZ");
        bikesSet1.add("Duke");

        System.out.println("Present bikes list are: "+bikesSet1);

        bikesSet1.set(1,"BMW");

        System.out.println("After bikes list are: "+bikesSet1);

        System.out.println("size is : "+bikesSet1.size());
        System.out.println("capacity is : "+bikesSet1.capacity());


        bikesSet1.trimToSize();
        System.out.println("After trim size is : "+bikesSet1.size());
        System.out.println("After trim capacity is : "+bikesSet1.capacity());

        System.out.println("first element is is : "+bikesSet1.firstElement());
        System.out.println("last element is is : "+bikesSet1.lastElement());
    
        System.out.println("\nIteration using for-each:");
        for (String bikes : bikesSet1) {
            System.out.println(bikes);
        }

        System.out.println("\nIteration using Iterator:");
        Iterator<String> it = bikesSet1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nIteration using ListIterator:");
        ListIterator<String> li = bikesSet1.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }

        System.out.println("\nIteration using Enumeration (legacy):");
        Enumeration<String> e = bikesSet1.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        bikesSet1.clear();
        System.out.println("After clear(), is empty? " + bikesSet1.isEmpty());
    }
}
