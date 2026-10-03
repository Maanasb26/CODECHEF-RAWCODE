// Find the Largest and second largest in array 
// Find the sum of largest and second largest element in array 
import java.util.*;
public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        System.out.println("Enter Number of Elements : ");
        n = sc.nextInt();

        int arr [] = new int [n];

        // INput In array 
        System.out.println("Enter Array Elements: ");
        for(int i =0; i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        // Logic 

        // 3 7 2 1 1 5 3
        // output = 12 ( 7+5)

       
        int largest =0;
        int secondlargest =0;

       
       for(int  i =0;i<n;i++)
       {
            if(arr[i]>largest )
            {
                secondlargest = largest;
                largest = arr[i];
            }
            else if (arr[i]>secondlargest && arr[i]!= largest)
            {
                secondlargest = arr[i];
            }

            

       }


       

        System.out.println("Largest "+largest);
        System.out.println("Second Largest "+secondlargest);
        System.out.println("Sum ");
        System.out.println(largest+secondlargest);

    }
}
