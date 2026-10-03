// MIN TO MAX 
/*
    find the minimum value in the array and then find out how many operation in the array 
    are needed to be done to convert each value to be equal to the minimum value in that array 

*/
import java.util.*;
public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =0;

        System.out.println("Enter the Number of Elements in Array : ");
        n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the Elements of Array ");
        for (int i =0; i <n; i++)
        {
            arr[i] = sc.nextInt();
        }


        // Exampe : 3,1,4,1 -> Minimum value 1 -> 2 Operations to convert 2 to 1 and 4 to 1 -> 1,1,1,1

        // Step 1 -> Find the minimum 

        int smallest =arr[0];

        for(int i =0; i<n;i++)
        {
            if(arr[i]<smallest)
            {
                smallest = arr[i];
            }

            
        }

        System.out.println("Smallest Element is : "+ smallest);

        int counter =0;
        for (int i =0; i<n;i++)
        {
            if(arr[i]>smallest)
            {
                arr[i]=smallest;
                counter++;
            }
        }

        System.out.println(" Number of Steps : "+ counter);


    }
}
