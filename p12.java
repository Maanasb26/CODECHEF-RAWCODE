// Two Sum Problems 
import java.util.*;
public class p12
{
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
        // 2,7,11,15 
        // Target --> 17 
        // output = 0, 3 
        
        for(int i =0; i< n;i++)
        {
            for(int j =i+1; j< n;j++)
            {
                if(arr[i] +  arr[j]== k)
                {
                    System.out.println("first index : "+i);
                    System.out.println("Second index : "+j);
                    flag = true;
                    break;

                }
                
            }
        }

        if (flag == false)
        {
            System.out.println(" Not found ");
        }


    }
}