// A program in Java to rotate a 2D array by 90 degrees clockwise.

import java.util.*;
public class Clock
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        int temp;
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        int clk[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.print("Enter no: ");
               arr[i][j]=sc.nextInt(); 
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               clk[i][j]=arr[n-j-1][i];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(clk[i][j]+" ");
            }
            System.out.println();
        }
    }
}
