// Intersection of Two sorted Arrays 
import java.util.ArrayList;
import java.util.Scanner;

public class p19 {
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

        // 1,2,2,3,5 
        // 1,2,7
        // Ouput -> 1,2 

        // 1,2,2,3,3,3,
        // 2,3,3,4,5,7
        // output -> 2,3,3

        ArrayList <Integer> list = new ArrayList<>();

        int nums1_index = 0;
        int nums2_index =0;

        while (nums1_index < nums1.length && nums2_index< nums2.length)
        {
            if(nums1[nums1_index]== nums2[nums2_index])
            {
                list.add(nums1[nums1_index]);
                nums1_index++;
                nums2_index++;
               
            }
            else if (nums1[nums1_index]<nums2[nums2_index])
            {
                nums1_index++;
            }
            else 
            {
                nums2_index++;
            }
             
        }

        System.out.println("-------------------------");

        System.out.println(list);


    }
}
