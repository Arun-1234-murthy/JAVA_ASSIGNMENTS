import java.util.Scanner;
public class SumEvenOdd 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0 ;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int eveSum = 0;
        int oddSum = 0;

        for(int i=0;i<n;i++)
        {

            if(a[i]%2==0)
                eveSum = eveSum + a[i];
    
            else
                oddSum = oddSum + a[i];
            
        }

        System.out.println("Even number sum : "+eveSum);
        System.out.println("Odd number sum : "+oddSum);

    }
}
