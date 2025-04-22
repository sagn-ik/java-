// Program to implement insertion sort algorithm in an array

public class InsertionSort
{
    public static void main()
    {
        int arr[]={3,1,2,5,4,6,8,7,9,0};
        int n=arr.length;
        int key,i;
        for(int j=1;j<n;j++)
        {
            key=arr[j];
            i=j-1;
            while(i>-1 && arr[i]>key)
            {
                arr[i+1]=arr[i];
                i--;
            }
            arr[i+1]=key;
        }
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}
