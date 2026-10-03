// Find the maximum element in array 
import java.util.*;
class p2{
    public static void main(String[] args) {
        int N=0;
        int t =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array ");
        N = sc.nextInt();
        int arr []  = new int [N];

        System.out.println("Enter Array Elements");
        for(int i =0;i<N;i++)
        {
            arr[i] = sc.nextInt();
        }

        int temp =0;

        for(int i =0;i<N;i++)
        {
            if(arr[i]>temp)
            {
                temp=arr[i];
            }
        }

        System.out.println("Largest Element is :");
        System.out.println(temp);



     }
}

