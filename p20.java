// Majority Element 
import java.util.*;
public class p20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Number Of Elements in Array : ");
        int n = sc.nextInt();

        int arr [] = new int[n];
        System.out.println("Enter Array Elements : ");
        for(int i =0; i< n; i++)
        {
            arr[i] = sc.nextInt();
        }

        HashMap <Integer, Integer> map = new HashMap<>();

        for(int i =0; i< n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i]) + 1);
            }
            
            else
            {
                map.put(arr[i],1 );
            }
        }

    System.out.println("----------------------------------");
        for(int key : map.keySet())
        {
            if(map.get(key)>n/2)
            {
                System.out.println(key);
                break;
            }
        }
    }
}
