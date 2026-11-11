// Find the Missing Number 
public class A3 {
    public static  void main (String ars[])
    {
        int[] arr = {3, 0, 1};
        int largest =0;
        int isum =0;
        for(int i =0; i< arr.length; i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
                
            }
            isum = isum + arr[i];
        }

        int totalsum = (largest *(largest+1))/2;
        int missing = totalsum - isum;
        System.out.println(missing);
    }
}
