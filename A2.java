// Move All Zeroes to End of An Array 
public class A2 {
    public static void main (String args [])
    {
        int[] arr = {0, 1, 0, 3, 12};

        for(int i =0; i<arr.length-1;i++)
        {
            int temp =0;
            for(int j=0; j<arr.length-1;j++)
            {
                if(arr[j]==0)
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    



        
        for(int i =0; i< arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
