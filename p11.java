// Rotate the Array BY K terms 
import java.util.*;
public class p11 
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Number or Elements in array : ");

        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the Array Elements in sequence ");

       
        for(int i =0; i< n;i++)
        {
            arr[i] = sc.nextInt();
        }

         System.out.println("Enter Value of K : ");

        int k = sc.nextInt();

        // 1,2,3,4,5 --> k = 3 --> 
        // Iteration 1 = 2,3,4,5,1
        // Iteration 2 = 3,4,5,1,2
        // Iteration 3 = 4,5,1,2,3

        int temp =0;

        
        for(int i =1; i<=k;i++)
        {
            temp = arr[0];
            for(int j =0;j<n-1;j++)
           {
            
            arr[j] = arr[j+1];

            }

                arr[n-1] = temp;      
        }


        for(int i =0; i< n;i++)
        {
            System.out.print(arr[i]+ " ");
        }

        
    }
}