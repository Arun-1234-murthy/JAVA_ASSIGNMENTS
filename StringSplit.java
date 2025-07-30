public class StringSplit {
    public static void main(String[] args) {
       String s = "I am a java Developer";
       String[] words = s.split(" ");
       for(String str : words) //or just System.out.println(Arrays.toString(words));
           System.out.println(str);
    }
}
