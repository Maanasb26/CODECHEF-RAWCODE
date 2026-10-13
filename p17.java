import java.util.*;

public class p17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Array Elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        int arr_sum =0;
        System.out.println("Enter Array Elements in Sequence : ");
        for(int i =0; i< n; i++)
        {
            arr[i] = sc.nextInt();
            arr_sum = arr_sum + arr[i];
        
        }

        // 0,2,3,1,4 -> Output -> 5 
        // [range = 0 to nums.lenght] -> range = [0,n]
        // Sprted Array -> 0,1,2,3,4 

       int missing_element = (n*(n+1)/2 ) - arr_sum;

       System.out.println("Missing Element is : "+ missing_element);



    }
}
