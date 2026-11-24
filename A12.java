// Swap Alternate Array Elements 
public class A12 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        // Output -> 2,1,4,3,6,5

        int temp =0;
        for(int i =0; i<arr.length-1; i++)
        {
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            i++;
        }

        for(int i =0; i< arr.length; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
