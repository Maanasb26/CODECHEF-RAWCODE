import java.util.*;
public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number of Players : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the Player Elements : ");
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        int smallest_idx =0;
        int smallest =arr[0];

        for(int i =0;i<n;i++)
        {
            if(arr[i]<smallest){
                smallest = arr[i];
                smallest_idx = i;
            }
        }


        System.out.println("Smallest : "+ smallest);
        int sum = 0;

        for(int i =0; i<n;i++)
        {
            if(i != smallest_idx)
            {
                 sum = sum + arr[i];
            }
            

        }

        System.out.println("Maximum price : "+sum);



    }
}
