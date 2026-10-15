// Reaarange the Array Elements According to their signs 
import java.util.*;
public class p23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements in Array : ");
        int n = sc.nextInt();

        int arr [] = new int[n];

        ArrayList <Integer> positive = new ArrayList<>();
        ArrayList <Integer> negative = new ArrayList<>();
    

        System.out.println("Enter The Array Elements in Sequence : ");
        for(int i =0;i< n;i++)
        {
            arr[i]= sc.nextInt();
            if(arr[i]>0)
            {
                positive.add(arr[i]);
            }
            else
            {
                negative.add(arr[i]);
            }
        }


        

        int i =0; 
        int positiveindex =0;
        int negativeindex =0;

        while (i<n)
        {
            arr[i] = positive.get(positiveindex);
            i++;
            positiveindex++;
            arr[i] = negative.get(negativeindex);
            i++;
            negativeindex++;
        }

        for(int k =0; k<n; k++)
        {
            System.out.print(arr[k]+ " ");
        }


        
        
    }
}
 