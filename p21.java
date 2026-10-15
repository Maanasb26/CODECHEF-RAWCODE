// Leaders In Array Code 
// Brute Force 
import java.util.*;
public class p21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in array : ");
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

        
        for(int i =0; i< n-1; i++)

        {

            boolean isleader = true;
            for(int j = i+1; j< n; j++)
            {
                if(arr[j]>arr[i])
                {
                    isleader = false;
                    break;
                }
                else
                {
                    isleader = true;
                    
                }

            }

            if(isleader)
            {
                list.add(arr[i]);
            }


        }

        

        list.add(arr[n-1]);

        System.out.println(list);
    }
}
