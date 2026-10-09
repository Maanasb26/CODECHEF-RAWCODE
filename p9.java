// Longest Sub array of 1 in binrary array 
// 10111001111 -> 4 
import java.util.*;
public class p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number of elements in an Array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the Array Elements only in binary ");

        int counter =0;
        int largest =0;


        for(int i =0; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }


       for(int i =0; i< n;i++)
       {
            if(arr[i]==1){
                counter++;
                if(counter>largest)
                {
                    largest=counter;
                }
            }
            else
            {
                counter=0;
            }
       }

       System.out.println("Output :"+largest);



      



    }
}
