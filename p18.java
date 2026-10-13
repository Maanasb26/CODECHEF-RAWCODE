// Uninion of Two Sorted Arrays in Ascending Order 
import java.util.*;
public class p18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of elements in first Array");
        int n1 = sc.nextInt();
        System.out.println("Enter NUmber of elements in second Array");
        int n2 = sc.nextInt();


        int nums1 [] = new int[n1];
        int nums2 [] = new int [n2];

        System.out.println("Enter The Elements in Array 1 : ");
        for(int i =0; i< n1; i++)
        {
            nums1[i]= sc.nextInt();
        }

        System.out.println("Enter The Elements in Array 2 : ");
        for(int i =0; i< n2; i++)
        {
            nums2[i]= sc.nextInt();
        }


        // nums 1 = 1,2,3,4,5 
        // nums 2 = 1,2,7 

        // output -> 1,2,3,4,5,7


        ArrayList <Integer> arr = new ArrayList<>();

        int nums1_index =0;
        int nums2_index =0;

        while (nums1_index<nums1.length && nums2_index < nums2.length)
        {

            if(nums1[nums1_index]< nums2[nums2_index])
            {
                if(arr.isEmpty()|| arr.get(arr.size()-1)!= nums1[nums1_index])
                {
                    arr.add(nums1[nums1_index]);
                    
                }
                nums1_index++;
            }
            else if (nums1[nums1_index]> nums2[nums2_index])
            {
                if(arr.isEmpty()|| arr.get(arr.size()-1)!= nums2[nums2_index])
                {
                    arr.add(nums2[nums2_index]);
                    
                }
                nums2_index++;
            }
            else
            {
                if(arr.isEmpty()|| arr.get(arr.size()-1)!= nums1[nums1_index])
                {
                    arr.add(nums1[nums1_index]);
                    
                }
                nums1_index++;
                nums2_index++;
            }
        }

        while (nums1_index<nums1.length)
        {
            if(arr.isEmpty()|| arr.get(arr.size()-1)!= nums1[nums1_index])
                {
                    arr.add(nums1[nums1_index]);
                    
                }
                nums1_index++;
        }

        while (nums2_index<nums2.length)
        {
            if(arr.isEmpty()|| arr.get(arr.size()-1)!= nums2[nums2_index])
                {
                    arr.add(nums2[nums2_index]);
                    
                }
                nums2_index++;
        }

        System.out.println("-------------------------------------");
        System.out.println(arr);



      


   



    }
}
