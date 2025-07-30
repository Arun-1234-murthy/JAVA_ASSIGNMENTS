import java.util.Scanner;

public class StringEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Full name: ");
        String name = sc.nextLine();
        System.out.println("Enter email : ");
        String email = sc.nextLine();
        if(email.contains("@") && email.endsWith(".com"))
        {

            System.out.println("valid email ");
        }

        else
        {

            System.out.println("invalid email");

        }

        String[] words = name.toLowerCase().split(" ");
        StringBuilder nameFormat = new StringBuilder();

        for(String word: words)
        {

            nameFormat.append(Character.toUpperCase(word.charAt(0)))
                             .append(word.substring(1)).append(" ");
                             
        }

        System.out.println("Formatted name is: "+nameFormat.toString().trim());

        int atIndex = email.indexOf("@");
        String domain = email.substring(atIndex);

        System.out.println("Email Domain: " + domain);

    }
}
