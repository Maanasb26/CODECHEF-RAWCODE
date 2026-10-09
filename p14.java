// Move All zeroes to the end of the array (right end of the array ) 
// Positives !
import java.util.*;
public  class p14 {
    public static void main (String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements in Java ");
        int n = sc.nextInt();

        int arr[]= new int[n];
      


        System.out.println("Enter the Array Elements in Sequence ");

        for(int i =0; i< n;i++)
        {
            arr[i] = sc.nextInt();
            
        }

        int temp =0;

        // Array -> 0,1,4,0,5,2
        // Output -> 1,4,5,2,0,0



        for(int i =0; i<n ; i++)
        {
            for(int j = 0; j<n-1;j++)
            {
                if(arr[j]==0)
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }





        for(int i =0; i< n;i++)
        {
            System.out.print(arr[i]+" ");
            
        }
    }
}
