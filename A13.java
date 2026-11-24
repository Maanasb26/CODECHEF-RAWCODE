// print Array Intersection Elements 


import java.util.HashSet;

public class A13 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 4, 6};

        // output --> 2,4

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr1)
        {
            set.add(num);
        }


       


        System.out.println("Intersection : ");

        for(int num : arr2)
        {
            if(set.contains(num))
            {
                System.out.println(num+ " ");
            }
            set.remove(num);
        }

        


       

        

        
    }
}
