import java.util.Arrays;
import java.util.Scanner;
// Dutch National Flag Algorithm 

public class p24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements in Array : ");
        int n = sc.nextInt();

        int arr [] = new int[n];

        for(int i =0; i< n;i++)
        {
            arr[i] = sc.nextInt();

        }
        

        int mid =0;
        int low =0;
        int high = n-1;

        while (mid <= high)
        {
            if(arr[mid]== 0)
            {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }
            else if (arr[mid]== 1)
            {
                mid++;
            }
            else
            {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
  
                high--;
            }
        }
        for(int i =0; i< n;i++)
        {
            System.out.print(arr [i]+ " ");

        }
      
    }
}
