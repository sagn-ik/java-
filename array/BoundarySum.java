import java.util.*;
public class BoundarySum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for n" );
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter number: ");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if (i==0 || i==n-1 || j==0 || j==n-1)
                    sum=sum+arr[i][j];
            }
            System.out.println("Sum= "+sum);
        }
    }
}