import java.util.ArrayList;

public class ArraylistExample {
    public static void main(String[] args) {
        ArrayList<String> iceCreams = new ArrayList<>();
        iceCreams.add("Butterscotch");
        iceCreams.add("DarkForest");
        iceCreams.add("Vanilla");
        iceCreams.add("chocolate");
        System.out.println("Present List are: ");
        for(String flavors: iceCreams){
            System.out.println(flavors);
        }
        System.out.println(iceCreams.get(0));
        iceCreams.set(0,"orange");
        ArrayList<String> iceCreams1 = new ArrayList<>();
        iceCreams1.add("Oreo");
        iceCreams1.add("Mango");
        iceCreams1.addAll(iceCreams);
        for(String flavors : iceCreams1){
            System.out.println(flavors);
        }
        iceCreams1.remove("orange");
        System.out.println("final list is: ");
        System.out.println("------------------------------------------");
        for(String flavors : iceCreams1){
            System.out.println(flavors);
        }
        System.out.println(iceCreams.isEmpty());
        System.out.println(iceCreams1.contains("orange"));
        System.out.println("size is : "+iceCreams1.size());
        iceCreams1.trimToSize();
        System.out.println("After trim size is : "+iceCreams1.size());
        }
}
