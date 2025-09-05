import java.util.Scanner;

public class Missing_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size (n): ");
        int n = sc.nextInt();   

        int[] arr = new int[n-1];
        System.out.println("Enter " + (n-1) + " elements:");
        for (int i = 0; i < n-1; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i <= n; i++) {  
            boolean found = false;
            for (int j = 0; j < n-1; j++) {

                if (arr[j] == i) {
                    found = true;
                    break;
                }

            }

            if (!found) {
                System.out.println("Missing number is: " + i);
                break;
            }

        }
    }
}
