// Move the array elements to the end of -> Optimisied 
import java.util.*;
public class p15
{
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

        int insert_pose =0;

        // Step 1 -> Move all the non zero elements to the begining of the array 

        for(int i =0; i< n;i++)
        {
            if(arr[i]!=0){
                arr[insert_pose] = arr[i];
                insert_pose++;
            }


        }

        while (insert_pose < n)
        {
            arr[insert_pose]= 0;
            insert_pose++;
        }

        System.out.println("Resulting Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}