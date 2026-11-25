// Remove Duplicates from Sorted array 
public class A18 {
    public static void main(String[] args) {
        int arr [] = {1,2,2,3,4,4,5,6};
        // output = 1,2,3,4,5,6

        
        int i =0;

        for(int j =1; j< arr.length; j++)
        {
            if(arr[j]!= arr[i])
            {
                i++;
                arr[i] = arr[j];
                
            }
        }


        for(int k =0; k<=i; k++)
        {
            System.out.print(arr[k]+ " ");
        }
    }
}
