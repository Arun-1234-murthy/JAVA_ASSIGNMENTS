import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int sum=0;
        while(n!=0){
            int rem = n%10;
            sum=sum+factorial(rem);
            n=n/10; 
        }
        if(sum==temp){
            System.out.println("strong number");
        }
        else{
            System.out.println("Not strong number");
        }
    }
    public static int factorial(int num){
        int fact = 1;
        for(int i=1;i<=num;i++){
             fact=fact*i;
        }
        return fact;
    }
}
