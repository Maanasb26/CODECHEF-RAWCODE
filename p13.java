// Two sum optimised using hashmaps 

import java.util.*;
public class p13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n =0;
        System.out.println("Enter the Array Elements : ");
        n = sc.nextInt();



        int arr[] = new int[n];
        System.out.println("Enter the Array Elements in Sequence : ");
        
        for (int i =0; i<n;i ++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Target Sum : ");
        int k = sc.nextInt();


        boolean flag = false;

        HashMap <Integer,Integer> map = new HashMap<>();

        for(int i =0; i< n; i++)
        {
            int complement = k - arr[i];

            if(map.containsKey(complement))
            {
                System.out.println("First Index : "+ map.get(complement));
                System.out.println("Second Index : "+i);
            }
            map.put(arr[i],i);
        }

        if (flag != true)
        {
            System.out.println("Not Found ");
        }

        
        // 2,7,11,15 
        // Target --> 17 
        // output = 0, 3 
    }
}
