// Union of Array Elements 

import java.util.HashMap;
import java.util.HashSet;

public class A16 {
    public static void main(String[] args) {
        int arr1 [] = {1,2,3,4,5};
        int arr2 [] = { 1,2,3,7};

        // output -> 1,2,3,4,5,7

       HashSet <Integer> set = new HashSet<>();

       for(int num : arr1)
       {
        set.add(num);
       }

       for(int num : arr2)
       {
            set.add(num);
       }

       System.out.println(set);

        
    }
}
