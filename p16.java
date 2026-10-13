// Remove Duplicates from Sorted Array 
import java.util.*;

class p16
{
    public static void main (String [] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Array Elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Elements in Sequence : ");

        for(int i =0; i< n; i++)
        {
            arr[i] = sc.nextInt();
        }

        // 0,0,3,3,5,5,6 -> ouput -> 4 

        int k =1;
        for(int i =1; i<n ; i++)
        {
            if(arr[i]!=arr[i-1])
            {
                arr[k]=arr[i];
                k++;
            }
        }

        System.out.println("Unique Elements are : ");
        System.out.println(k);

    }
}