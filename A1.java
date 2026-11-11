// Find the Second Largest in an Array 
public class A1 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1, 50};

        int largest =Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int i =0; i< arr.length; i++)
        {
        
            if(arr[i]>largest)
            {
                secondlargest = largest;
                largest = arr[i];
                
            }
            else if (arr[i]<largest && arr[i]> secondlargest)
            {
                secondlargest = arr[i];
            }
        }

        System.out.println(secondlargest);
    }
}
