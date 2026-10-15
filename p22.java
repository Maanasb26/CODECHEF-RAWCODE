// Leaders in Array -> Optimised Apraoch 
import java.util.*;
public class p22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Array Elements : ");
        
         int n = sc.nextInt();

        int arr [] = new int[n];

        System.out.println("Enter the Array ELements: ");

        for(int i =0; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }


        // [1, 2, 5, 3, 1, 2]
        // Ouput -> [5, 3, 2]


        ArrayList <Integer> list = new ArrayList<>();

        int maxfromright = arr[n-1];
        list.add(arr[maxfromright]);

        for(int i = n-2; i>=0; i--)
        {
            if(arr[i]>arr[maxfromright])
            {
                maxfromright = i;
                list.add(arr[maxfromright]);
            }
        }

        System.out.println(list.reversed());







    }
}
